/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.models;

/**
 *
 * @author lordz
 */
public class Teacher {
    private String name;
    private String sex;
    private int age;
    private String employmentStatus;
    private String activeStatus;
    
    public Teacher(String name, String sex, int age, String employmentStatus, String activeStatus){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.employmentStatus = employmentStatus;
        this.activeStatus = activeStatus;
    }
    
    //Getters & Setters
    public String getName(){ return name; };
    public String getSex(){ return sex; };
    public int getAge(){ return age; };
    public String getEmpStatus(){ return employmentStatus; };
    public String getActiveStatus(){ return activeStatus; };
}
