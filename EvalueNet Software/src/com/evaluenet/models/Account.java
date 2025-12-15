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
    private String squestion;
    private String sqanswer;
    private int loginLimit;
    private int sqLimit;
    
    public Account(String name, String username, String password, int loginLimit, String squestion, String sqanswer, int sqLimit, String userType){
        this.name = name;
        this.username = username;
        this.password = password;
        this.loginLimit = loginLimit;
        this.squestion = squestion;
        this.sqanswer = sqanswer;
        this.sqLimit = sqLimit;
        this.userType = userType;
    }
    
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
    
    public Account(String username){
        this.username = username;
    }
    
    
    
    public String getFullname(){ return name; }
    public String getUsername(){ return username; }
    public String getPassword(){ return password; }
    public String getQuestion(){ return squestion; }
    public String getAnswer(){ return sqanswer; }
    public String getType(){ return userType; }
    public int getLoginAttempt(){ return loginLimit; }
    public int getSqAttempt(){ return sqLimit; }
    
}
