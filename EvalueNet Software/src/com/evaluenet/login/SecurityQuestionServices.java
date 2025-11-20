/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.login;

import com.evaluenet.admin.Admin;
import com.evaluenet.hr.HRLANDING;
import com.evaluenet.it.ITADDACC;
import com.evaluenet.teacher.TCHLANDING;
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author lordz
 */
public class SecurityQuestionServices {
    
    static Connection conn;
    
    public static void establishConnection() throws SQLException, ClassNotFoundException{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver Connection
            Dotenv dotenv = Dotenv.configure().directory("./com/evaluenet/database").filename("dbaccess.env").load();
            conn = DriverManager.getConnection(dotenv.get("DB_URL"),dotenv.get("DB_USER"),dotenv.get("DB_PASSWORD")); //Database Connection
        //Checks connection
            if(conn != null){
                System.out.println("Connection successfully");
            }     
    }
    
    public static void resetAttempts(JLabel username){
        try {
            establishConnection();
            String user = username.getText();
            PreparedStatement getUserAttempt = conn.prepareStatement("UPDATE tblaccounts SET logAttempt = 4, SQ_Attempts = 3 WHERE username = ?");
                getUserAttempt.setString(1, user);
                getUserAttempt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoginUI.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void getSqQues(JLabel username, JLabel question){
        try {
            establishConnection();
            String user = username.getText();
            PreparedStatement quesStmt = conn.prepareStatement("SELECT * FROM tblaccounts WHERE username = ?");
            quesStmt.setString(1, user);
            ResultSet getQues = quesStmt.executeQuery();
            if(getQues.next()){
                question.setText(getQues.getString("SEC_QUES"));
            }
            quesStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(SecurityQuestionServices.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(SecurityQuestionServices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void loginSqAuth(JLabel username, JTextField answerField, JFrame frame){
        String user = username.getText();
        String answer = answerField.getText();
        try {
            establishConnection();
            PreparedStatement attemptStmt = conn.prepareStatement("SELECT * FROM tblaccounts WHERE username = ?");
            attemptStmt.setString(1, user);
            ResultSet checkAttempt = attemptStmt.executeQuery();
            if(checkAttempt.next()){
                String name = checkAttempt.getString("FullName");
                String userType = checkAttempt.getString("userType");
                int attempt = checkAttempt.getInt("SQ_Attempts");
                
                if(attempt >= 1){
                    PreparedStatement ansStmt = conn.prepareStatement("SELECT * FROM tblaccounts WHERE username = ? AND ANS_SQ = ?");
                    ansStmt.setString(1, user);
                    ansStmt.setString(2, answer);
                    ResultSet checkAns = ansStmt.executeQuery();
                    if(checkAns.next()){
                        //Level of access 
                        switch(userType){
                            case "Admin" -> {
                                frame.dispose();
                                Admin a1 = new Admin(name);
                                resetAttempts(username);
                                a1.setVisible(true);
                            }
                            case "Teacher" -> {
                                frame.dispose();
                                TCHLANDING tl = new TCHLANDING(name);
                                resetAttempts(username);
                                tl.setVisible(true);
                            }
                            case "IT" -> {
                                frame.dispose();
                                ITADDACC i1 = new ITADDACC(name);
                                resetAttempts(username);
                                i1.setVisible(true);
                            }
                            case "HR" -> {
                                frame.dispose();
                                HRLANDING h1 = new HRLANDING(name);
                                resetAttempts(username);
                                h1.setVisible(true);  
                            }
                        }    
                    }else{
                        PreparedStatement lmtcheckupdate = conn.prepareStatement("UPDATE tblaccounts SET SQ_Attempts = SQ_Attempts - 1 WHERE username = ?");
                        lmtcheckupdate.setString(1,user);
                        lmtcheckupdate.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Incorrect answer. "+attempt+" tries left.");
                        answerField.setText(""); 
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Limit has been reached. Account locked. Please Contact IT Support.");
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SecurityQuestionServices.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(SecurityQuestionServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
   
}
