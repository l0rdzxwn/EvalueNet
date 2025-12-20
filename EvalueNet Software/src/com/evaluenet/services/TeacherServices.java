/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.services;

import com.evaluenet.models.Teacher;
import com.evaluenet.repository.TeacherRepository;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lordz
 */
public class TeacherServices {
    
    TeacherRepository tchRepo = new TeacherRepository();
    
    public List<Integer> fetchAnalytics(){
        return tchRepo.fetchAnalytics();
    }
    
    public List<Teacher> fetchTeachers(){
        return tchRepo.fetchAllTeachers();
    }
    
    public void createTeacher(String name, String age, String sex, String empStatus, String activeStatus){
        if(name.equals(null)){
            JOptionPane.showMessageDialog(null,"Please include a name");
            return;
        }
        
        if(age.equals(null)){
            JOptionPane.showMessageDialog(null,"Please include an age");
            return;
        }
        
        if(sex.equals(null)){
            JOptionPane.showMessageDialog(null,"Please include a sex");
            return;
        }
        
        Teacher teacher = new Teacher(name,sex,age,empStatus,activeStatus);
        tchRepo.insertTeacher(teacher);
        JOptionPane.showMessageDialog(null,"New teacher had been added successfully!");
    }
}
