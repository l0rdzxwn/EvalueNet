/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.models;


public class Account {
 
    private String name;
    private String username;
    private String password;
    private String userType;
    
    public Account(String name, String username, String password, String userType){
        this.name = name;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }
    
    public Account(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public String getFullname(){ return name; }
    public String getUsername(){ return username; }
    public String getPassword(){ return password; }
    public String getType(){ return userType; }
    
}
