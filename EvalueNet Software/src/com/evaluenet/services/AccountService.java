/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.services;

import com.evaluenet.admin.Admin;
import com.evaluenet.hr.HRLANDING;
import com.evaluenet.it.ITADDACC;
import com.evaluenet.login.SecurityQuestionUI;
import com.evaluenet.models.Account;
import com.evaluenet.repository.AccountRepository;
import com.evaluenet.repository.AccountRepository;
import com.evaluenet.teacher.TCHLANDING;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author lordz
 */
public class AccountService {
    
    private final AccountRepository accRepo = new AccountRepository();
     
    
    // ADD DUPLICATE USERNAME HANDLER >>>>>>>>>>>>>
    public void createAccount(String fullname,String username,String password,String usertype){
        Account acc = new Account(fullname, username, password, usertype);
        boolean hasSpecialChar = Pattern.compile("[!@#$%^&*(),.?\":{}|<>]").matcher(acc.getPassword()).find();
        boolean hasNumber = Pattern.compile("[0-9]").matcher(acc.getPassword()).find();
        boolean hasUpperCase = Pattern.compile("[A-Z]").matcher(acc.getPassword()).find();
        
            if(acc.getPassword().length() < 8 || hasSpecialChar == false || hasNumber == false || hasUpperCase == false){
                JOptionPane.showMessageDialog(null,"Please follow the format");
            }else{
                accRepo.insertAcc(acc);
                JOptionPane.showMessageDialog(null,"You have created a new account: " + acc.getFullname());
            }
    }
    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    
    public void deleteAccount(String username){
        accRepo.removeByUsername(username);
        JOptionPane.showMessageDialog(null,username+" has been successfully removed.");
    }
    
    public void resetAccountLimit(String username){
        accRepo.resetByUsername(username);
        JOptionPane.showMessageDialog(null,"Limit attempts had been reset successfully for " + username + ".");
    }
    
    public void loginAuth(String username, String password, JFrame frame){
        
        Account acc = new Account(username,password);
        boolean isVerified = accRepo.checkCredentials(acc);
        int userAttempt = accRepo.getAttemptByUsername(username);
        String creds[] = accRepo.findUserCredentials(acc);
        
        if(userAttempt > 0){
            if(isVerified){
                String userType = creds[0];
                String name = creds[1];
                switch(userType){
                    case "Admin" -> {
                        frame.dispose();
                        Admin a1 = new Admin(name);
                        accRepo.resetByUsername(username);
                        a1.setVisible(true);
                    }
                    case "Teacher" -> {
                        frame.dispose();
                        TCHLANDING tl = new TCHLANDING(name);
                        accRepo.resetByUsername(username);
                        tl.setVisible(true);
                    }
                    case "IT" -> {
                        frame.dispose();
                        ITADDACC i1 = new ITADDACC(name);
                        accRepo.resetByUsername(username);
                        i1.setVisible(true);
                    }
                    case "HR" -> {
                        frame.dispose();
                        HRLANDING h1 = new HRLANDING(name);
                        accRepo.resetByUsername(username);
                        h1.setVisible(true);  
                    }
                } 
            }else{
               accRepo.decreaseLimitByUsername(username);
               int tempAttempt = accRepo.getAttemptByUsername(username);
               JOptionPane.showMessageDialog(null, "Incorrect password. "+tempAttempt+" tries left.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Login limit has been reached. Account locked.");
            int ans = JOptionPane.showConfirmDialog(null, "Do you want to access via Security Question?", "Yes/No Dialog", JOptionPane.YES_NO_OPTION);
            if(ans == JOptionPane.YES_OPTION) {
                SecurityQuestionUI lvsq = new SecurityQuestionUI(username);
                lvsq.setVisible(true);
                frame.dispose();
            }
        }
        
        
        
        
    }
}
