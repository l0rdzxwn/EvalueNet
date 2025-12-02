/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluenet.services;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
/**
 *
 * @author lordz
 */
public class DatabaseService {
    public static Connection establishConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver"); //Driver Connection
        Dotenv dotenv = Dotenv.configure().directory("./com/evaluenet/database").filename("dbaccess.env").load();
        Connection conn = DriverManager.getConnection(dotenv.get("DB_URL"),dotenv.get("DB_USER"),dotenv.get("DB_PASSWORD")); //Database Connection
        //Checks connection
        if(conn != null){
            System.out.println("Connection successfully");
        }
        return conn;
}
}
