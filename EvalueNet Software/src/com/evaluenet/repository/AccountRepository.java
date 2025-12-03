/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.repository;
import com.evaluenet.models.*;
import com.evaluenet.services.DatabaseService;
import com.evaluenet.admin.SubjectForm;
import com.evaluenet.admin.tablesf1;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AccountRepository {
    
    public List<Account> findAll(){
        List<Account> accounts = new ArrayList<>();
        try{
            Connection conn = DatabaseService.establishConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT FullName, username, password, userType FROM tblaccounts");
            ResultSet getAll = stmt.executeQuery();
            while(getAll.next()){
                Account acc = new Account(
                    getAll.getString("FullName"),
                    getAll.getString("username"),
                    getAll.getString("password"),
                    getAll.getString("userType")
                );  
                accounts.add(acc);
            }
            stmt.close();
        }catch (SQLException ex) {
           Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex){
           Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accounts;
    }
    
    public void insertAcc(Account account){
        try {          
            Connection conn = DatabaseService.establishConnection();
            PreparedStatement insertAcc = conn.prepareStatement("INSERT INTO tblaccounts(FullName, username, password,userType) VALUES(?,?,?,?)");
            insertAcc.setString(1,account.getFullname());
            insertAcc.setString(2,account.getUsername());
            insertAcc.setString(3,account.getPassword());
            insertAcc.setString(4,account.getType());
            insertAcc.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void removeByUsername(String username){
        try{
            Connection conn = DatabaseService.establishConnection();
            PreparedStatement remStmt = conn.prepareStatement("DELETE FROM tblaccounts WHERE username = ?");
            remStmt.setObject(1,username);
            remStmt.executeUpdate();
            
        }catch(SQLException ex){
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void resetByUsername(String username){
        try{
            Connection conn = DatabaseService.establishConnection();
            PreparedStatement resetStmt = conn.prepareStatement("UPDATE tblaccounts SET logAttempt = 4 , SQ_Attempts = 3 WHERE username = ?");
            resetStmt.setString(1,username);
            resetStmt.executeUpdate();
            
        }catch(SQLException ex){
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int countByType(String userType){
        int total = 0;
        try{
            Connection conn = DatabaseService.establishConnection();
            PreparedStatement getNum = conn.prepareStatement("SELECT COUNT(*) as total_accounts FROM tblaccounts WHERE userType = ? ");
            getNum.setObject(1,userType);
            ResultSet numCount = getNum.executeQuery();
            
            if(numCount.next()){
                total = numCount.getInt("total_accounts");
            }
            getNum.close();
            
        }catch(SQLException ex){
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    public int getAttemptByUsername(String username){
        int numAttempt = 0;
        try{
            Connection conn = DatabaseService.establishConnection();
            PreparedStatement getNum = conn.prepareStatement("SELECT logAttempt FROM tblaccounts WHERE username = ? ");
            getNum.setObject(1,username);
            ResultSet check = getNum.executeQuery();
            if(check.next()){
               numAttempt = check.getInt("logAttempt");
            }
            getNum.close();
        }catch(SQLException ex){
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numAttempt;
    }
    
    public void decreaseLimitByUsername(String username){
        try{
            Connection conn = DatabaseService.establishConnection();
            PreparedStatement lmtcheckupdate = conn.prepareStatement("UPDATE tblaccounts SET logAttempt = logAttempt - 1 WHERE username = ?");
            lmtcheckupdate.setString(1,username);
            lmtcheckupdate.executeUpdate();
            lmtcheckupdate.close();
        }catch(SQLException ex){
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean checkCredentials(Account acc){
        boolean isCorrect = false;
        try{
            Connection conn = DatabaseService.establishConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM tblaccounts WHERE username = ? AND password = ?");
            stmt.setString(1, acc.getUsername());
            stmt.setString(2, acc.getPassword());
            ResultSet verify = stmt.executeQuery();
            if(verify.next()){
               isCorrect = true;
            }
        }catch(SQLException ex){
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isCorrect;
    }
    
    public String[] findUserCredentials(Account acc){
        String userType = null;
        String fullName = null;
        try{
            Connection conn = DatabaseService.establishConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM tblaccounts WHERE username = ? AND password = ?");
            stmt.setString(1, acc.getUsername());
            stmt.setString(2, acc.getPassword());
            ResultSet verify = stmt.executeQuery();
            if(verify.next()){
               userType = verify.getString("userType");
               fullName = verify.getString("FullName");
            }
        }catch(SQLException ex){
            Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
             Logger.getLogger(AccountRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new String[]{userType,fullName};
    }
    
}
