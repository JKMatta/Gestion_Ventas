/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;

/**
 *
 * @author Javier
 */
public class conexion {

    public conexion() {
        
    }
    
    public static Connection getConnection()throws ClassNotFoundException{
        Connection conn=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd","root","");
            System.out.println("Conexion exitosa");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    } 
        
    
}
