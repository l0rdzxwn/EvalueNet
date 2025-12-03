/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.repository;

import com.evaluenet.models.Teacher;
import com.evaluenet.services.DatabaseService;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lordz
 */
public class TeacherRepository {
    
    public List<Teacher> findAllTeachers(){
        List<Teacher> teacher = new ArrayList<>();
        try{
            Connection conn = DatabaseService.establishConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM tchInfo");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Teacher tch = new Teacher(
                     rs.getString("NAME"),
                     rs.getString("SEX"),
                     rs.getInt("AGE"),
                     rs.getString("EMP_STATUS"),
                     rs.getString("STATUS")
                );
                teacher.add(tch);
            }
            stmt.close();
        }catch(SQLException ex){
            Logger.getLogger(TeacherRepository.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(TeacherRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return teacher;
    }
    
    
}
