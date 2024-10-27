/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class conexion {
    
    Connection cn;
    public Connection conex(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://database-java.cwo5bca6bz3b.us-east-1.rds.amazonaws.com:3306/dbescuela?useSSL=false&serverTimezone=UTC", "admin", "jhonbrayansilva");
            System.out.println("la conexion fue exitosa");
        } catch (Exception e) {
            System.out.println("la conexion no se realizado " + e);
        }
    return cn;
    }
    
}
