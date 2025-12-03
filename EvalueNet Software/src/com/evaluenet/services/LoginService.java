/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.services;
import com.evaluenet.login.LoginUI;
import com.evaluenet.admin.Admin;
import com.evaluenet.hr.HRLANDING;
import com.evaluenet.it.ITADDACC;
import com.evaluenet.login.LoginUI;
import com.evaluenet.login.SecurityQuestionUI;
import com.evaluenet.teacher.TCHLANDING;
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author lordz
 */
public class LoginService {
    
    //------------------
    // GLOBAL VARIABLES
    //------------------
    static int limitVal = 0;
    

    public static void loginAuth(JTextField username,JTextField password, JFrame frame){
        if(!username.getText().equals("") && !password.getText().equals("")){
            String user = username.getText().trim();
            String pass = password.getText().trim();       
            try {
                establishConnection();
                
                PreparedStatement attemptStmt = conn.prepareStatement("SELECT * FROM tblaccounts WHERE username = ?");
                attemptStmt.setString(1,user);
                ResultSet checkAttempt = attemptStmt.executeQuery();
                if(checkAttempt.next()){
                    limitVal = checkAttempt.getInt("logAttempt");
                    if(limitVal > 0){
                        PreparedStatement pstmt = conn.prepareStatement("SELECT*FROM tblaccounts WHERE username = ? AND password = ?");
                        pstmt.setString(1, user); //Sets String user to column, username
                        pstmt.setString(2, pass); //Sets String pass to column, password
                        ResultSet verify = pstmt.executeQuery();
                        if(verify.next()){ //Verifies username & password  
                            String name = verify.getString("FullName");
                            String userType = verify.getString("userType");
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
                            PreparedStatement lmtcheckupdate = conn.prepareStatement("UPDATE tblaccounts SET logAttempt = logAttempt - 1 WHERE username = ?");
                            lmtcheckupdate.setString(1,user);
                            lmtcheckupdate.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Incorrect password. "+limitVal+" tries left.");
                            username.setText(""); 
                            password.setText("");      
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Login limit has been reached. Account locked.");
                        int ans = JOptionPane.showConfirmDialog(null, "Do you want to access via Security Question?", "Yes/No Dialog", JOptionPane.YES_NO_OPTION);
                        if(ans == JOptionPane.YES_OPTION) {
                            String userVal = username.getText();    
                            SecurityQuestionUI lvsq = new SecurityQuestionUI(userVal);
                            lvsq.setVisible(true);
                            frame.dispose();
                        }else if(ans == JOptionPane.NO_OPTION) {
                            
                        }
                    }
                }
                
                
            }catch (SQLException ex) {
               Logger.getLogger(LoginUI.class.getName()).log(Level.SEVERE, null, ex); 
            }catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Username or password has a null value. Please input a value.");
        }
    }
    
    public static void accessSQ(JTextField textfield,JFrame frame){
        if(textfield.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please put your username first before proceeding.");
        }else{
            String userVal = textfield.getText();
            SecurityQuestionUI lvsq = new SecurityQuestionUI(userVal);
            lvsq.setVisible(true);
            frame.setVisible(false);
        }
    }
    
    
}
