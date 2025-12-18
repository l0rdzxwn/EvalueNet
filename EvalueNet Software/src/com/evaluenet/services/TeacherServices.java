/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.services;

import com.evaluenet.models.Teacher;
import com.evaluenet.repository.TeacherRepository;
import java.util.List;

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
}
