/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.services;

import com.evaluenet.admin.SubjectForm;
import com.evaluenet.admin.tablesf1;
import com.evaluenet.it.ITADDACC;
import com.evaluenet.models.Account;
import com.evaluenet.models.AccountRepository;
import com.evaluenet.repository.AccountRepository;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
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
    static Connection conn;
    static DefaultComboBoxModel<String> tcModel = new DefaultComboBoxModel<>();
    AccountRepository accRepo = new AccountRepository();
    
    
    //==========================
    // ITADDACC FUNCTIONS
    //==========================
    public List<Account> getAll(){
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
