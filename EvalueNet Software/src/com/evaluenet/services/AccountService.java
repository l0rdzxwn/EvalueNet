/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.services;

import com.evaluenet.models.Account;
import com.evaluenet.repository.AccountRepository;
import com.evaluenet.repository.AccountRepository;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author lordz
 */
public class AccountService {
    
    private final AccountRepository accRepo = new AccountRepository();
     
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
    
    public void deleteAccount(String username){
        accRepo.removeByUsername(username);
        JOptionPane.showMessageDialog(null,username+" has been successfully removed.");
    }
    
    public void resetAccountLimit(String username){
        accRepo.resetByUsername(username);
        JOptionPane.showMessageDialog(null,"Limit attempts had been reset successfully for " + username + ".");
    }
}
