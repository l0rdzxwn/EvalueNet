/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.login;

import com.evaluenet.admin.Admin;
import com.evaluenet.hr.HRLANDING;
import com.evaluenet.it.ITADDACC;
import com.evaluenet.teacher.TCHLANDING;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author lordz
 */
public class SecurityQuestionServices {
    public void tempAccess(JTextField username,JTextField sq,JTextField ans ){
        String user = username.getText();
        String secQues = sq.getText();
        String answer = ans.getText();
        if(answer.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your answer.");
        }else{
        try {
            PreparedStatement verify = conn.prepareStatement("SELECT username, ANS_SQ, SQ_Attempts FROM tblaccounts WHERE username = ?");
                verify.setString(1, user);
                ResultSet checkAns = verify.executeQuery();
    
                    if(checkAns.next()){
                        String ansVal = checkAns.getString("ANS_SQ");
                        int limitVal = checkAns.getInt("SQ_Attempts");
                            if(ansVal.equals(answer)){
                                if(limit > 0){
                                    PreparedStatement reduceAttempt = conn.prepareStatement("UPDATE tblaccounts SET SQ_Attempts =  SQ_Attempts - 1 WHERE username = ?");
                                        reduceAttempt.setString(1, user);
                                        reduceAttempt.executeUpdate();
                                        String getName = "SELECT FullName FROM tblaccounts WHERE username = ?";
                                        
                  if(user.contains("ADMIN")){
                     PreparedStatement getAdminName = conn.prepareStatement(getName);
                    getAdminName.setString(1, user);
                    ResultSet findAdmin = getAdminName.executeQuery();
                    
                    if(findAdmin.next()){
                        String adminName = findAdmin.getString("FullName");
                    dispose();
                    Admin a1 = new Admin(adminName);
                    resetAttempts();
                    a1.setVisible(true);
                    
                    }
                }else if(user.contains("TCH")){
                    PreparedStatement getTCName = conn.prepareStatement(getName);
                    getTCName.setString(1, user);
                    ResultSet findTC = getTCName.executeQuery();
                    
                    if(findTC.next()){
                    String TCname = findTC.getString("FullName");
                    TCHLANDING tl = new TCHLANDING(TCname);
                    
                    dispose();
                    resetAttempts();
                    tl.setVisible(true);
                    }
                }else if(user.contains("IT")){
                     PreparedStatement getITName = conn.prepareStatement(getName);
                    getITName.setString(1, user);
                    ResultSet findIT = getITName.executeQuery();
                    if(findIT.next()){
                    dispose();
                    String ITname = findIT.getString("FullName");
                    ITADDACC i1 = new ITADDACC(ITname);
                    
                   resetAttempts();
                    i1.setVisible(true);
                    }
                }else if(user.contains("HR")){
                    PreparedStatement getHRName = conn.prepareStatement(getName);
                    getHRName.setString(1, user);
                    ResultSet findHR = getHRName.executeQuery();
                    
                    if(findHR.next()){
                    dispose();
                    
                    String HRname = findHR.getString("FullName");
                    HRLANDING h1 = new HRLANDING(HRname);
                    
                    resetAttempts();
                    h1.setVisible(true);
                    }
                    }
                                }else{
                                    JOptionPane.showMessageDialog(null,"Try another account. You already used all attempt in this username.");
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,"Incorrect answer, Please try again.");
                            }
                    }
        } catch (SQLException ex) {
            Logger.getLogger(SecurityQuestionUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
                }
}
