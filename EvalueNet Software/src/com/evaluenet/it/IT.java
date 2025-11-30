/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.it;

import com.evaluenet.admin.SubjectForm;
import com.evaluenet.admin.tablesf1;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lordz
 */
public class IT {
    static Connection conn;
    static DefaultComboBoxModel<String> tcModel = new DefaultComboBoxModel<>();
    
    public static void establishConnection() throws SQLException, ClassNotFoundException{
        
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver Connection
            Dotenv dotenv = Dotenv.configure().directory("./com/evaluenet/database").filename("dbaccess.env").load();
            conn = DriverManager.getConnection(dotenv.get("DB_URL"),dotenv.get("DB_USER"),dotenv.get("DB_PASSWORD")); //Database Connection
        //Checks connection
            if(conn != null){
                System.out.println("Connection successfully");
            }
    }
    
    
    
    //==========================
    // ITADDACC FUNCTIONS
    //==========================
    public static void getItem(JTable table){
        try {    
            establishConnection();
            PreparedStatement getSec = conn.prepareStatement("SELECT FullName, username, userType FROM tblaccounts ");
            ResultSet findSection = getSec.executeQuery();
            ResultSetMetaData getColVal = (ResultSetMetaData) findSection.getMetaData();
            int q = getColVal.getColumnCount();
            DefaultTableModel secAssign = (DefaultTableModel) table.getModel();
            secAssign.setRowCount(0);
            table.setDefaultEditor(Object.class, null);
            while (findSection.next()) {
                Object[] row = new Object[q];
                for (int i = 1; i <= q; i++) {
                    row[i - 1] = findSection.getObject(i); // Get each column value
                }
                secAssign.addRow(row); // Add the row to the table model
            }
            getSec.close();
        }catch (SQLException ex) {
           Logger.getLogger(tablesf1.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex){
           Logger.getLogger(tablesf1.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    
    public static void getAnalytics(String userType, JLabel label){
        try {
            establishConnection();
            PreparedStatement getNum = conn.prepareStatement("SELECT COUNT(*) as total_accounts FROM tblaccounts WHERE userType = ? ");
                getNum.setObject(1,userType);
            ResultSet numCount = getNum.executeQuery();
            if(numCount.next()){
                
                label.setText(Integer.toString(numCount.getInt("total_accounts")));
            }
            getNum.close();
        } catch (SQLException ex) {
            System.getLogger(ITADDACC.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //==========================
    // ITADDACCFORM FUNCTIONS
    //==========================
    
     public static void resetLimit(JTextField uNameRes){
        try{
            establishConnection();
            PreparedStatement resetStmt = conn.prepareStatement("UPDATE tblaccounts SET logAttempt = 4 , SQ_Attempts = 3 WHERE username = ?");
            resetStmt.setString(1,uNameRes.getText());
            resetStmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Limit attempts had been reset successfully for " + uNameRes.getText() + ".");
        }catch(SQLException ex){
            Logger.getLogger(tablesf1.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void removeAcc(JTextField uNameRem){
        try{
            establishConnection();
            PreparedStatement remStmt = conn.prepareStatement("DELETE FROM tblaccounts WHERE username = ?");
            remStmt.setObject(1,uNameRem.getText());
            remStmt.executeUpdate();
            JOptionPane.showMessageDialog(null,uNameRem.getText()+" has been successfully removed.");
        }catch(SQLException ex){
            Logger.getLogger(tablesf1.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void insertAcc(String fullName, JTextField passbox, JComboBox USERNAME, JTextField uName){
        
        String pass = passbox.getText();
        String uType =(String) USERNAME.getSelectedItem(); 
        String fullUsername = uName.getText();
       
            
             // Check for special characters
        boolean hasSpecialChar = Pattern.compile("[!@#$%^&*(),.?\":{}|<>]").matcher(pass).find();
        // Check for at least one number
        boolean hasNumber = Pattern.compile("[0-9]").matcher(pass).find();
        // Check for at least one uppercase letter
        boolean hasUpperCase = Pattern.compile("[A-Z]").matcher(pass).find();
                
            if(pass.length() < 8 || hasSpecialChar == false || hasNumber == false || hasUpperCase == false){
                JOptionPane.showMessageDialog(null,"Please follow the format");
            }
            else{
                try {
                    establishConnection();
                    PreparedStatement insertAcc = conn.prepareStatement("INSERT INTO tblaccounts(FullName, username, password,userType) VALUES(?,?,?,?)");
                    insertAcc.setString(1,fullName);
                    insertAcc.setString(2,fullUsername);
                    insertAcc.setString(3,pass);
                    insertAcc.setString(4,uType);
                    insertAcc.executeUpdate();

                    JOptionPane.showMessageDialog(null,"You have created a new account: " +fullUsername);
                }catch (SQLException ex) {
                    Logger.getLogger(ITADDACCFORM.class.getName()).log(Level.SEVERE, null, ex);
                }catch(ClassNotFoundException ex){
                    Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
                }       
            }   
    }
    
    public static void getTeachers() {
        String getTC = "SELECT NAME FROM tchInfo";
        try {
            establishConnection();
            PreparedStatement applySQL = conn.prepareStatement(getTC);
            ResultSet tcVal = applySQL.executeQuery();

            System.out.println("All Rows:");
            while(tcVal.next()) {

                String tcName = tcVal.getString("NAME");
                System.out.println("FullName: " + tcName);
                tcModel.addElement(tcName);
            }

            applySQL.executeQuery();


        } catch (SQLException ex) {
            Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
