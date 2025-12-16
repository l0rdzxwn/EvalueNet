/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.services;

import com.evaluenet.admin.SubjectForm;
import com.evaluenet.admin.tablesf1;
import com.evaluenet.it.ITADDACC;
import com.evaluenet.models.Account;
import com.evaluenet.repository.AccountRepository;
import com.evaluenet.models.Teacher;
import com.evaluenet.repository.AccountRepository;
import com.evaluenet.repository.TeacherRepository;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Set;
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
public class ITService {
    
    private final AccountRepository accRepo = new AccountRepository();
    private final TeacherRepository tchRepo = new TeacherRepository();
    
    public Set<Account> getAll(){
        return accRepo.findAll();
    }
    
    public int getTeacherTotal(){
        return accRepo.countByType("Teacher");
    }
    
    public int getAdminTotal(){
        return accRepo.countByType("Admin");
    }
    
    public int getHRTotal(){
        return accRepo.countByType("HR");
    }
    
    public List<Teacher> getTeachers() {
        return tchRepo.findAllTeachers();
    }
    
    public void saveSQ(String username,String answer, String question){
        Set<Account> account = accRepo.findAll();
        for(Account acc: account){
            if(acc.getUsername().contains(username)){
                if(acc.getQuestion().equals("none")){
                    accRepo.saveSqDetails(question,answer,acc.getUsername());
                    JOptionPane.showMessageDialog(null,"Security Question for this account has been set successfully!");
                }
            }
        }
        
    }

    
}
