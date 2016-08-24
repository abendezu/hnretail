/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnretail.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;

/**
 *
 * @author abendezu
 */
public class dbConn {
       
    private final String url = "jdbc:mysql://172.21.1.158/hnretail";
    Connection conn = null;
   
    public dbConn() {
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,"hnretail","hnretail");
            if (conn!=null){
                System.out.println("Conexión a base de datos. listo");
            }
        } catch(SQLException e){
            System.out.println("Error SQLException: "+e);
        } catch(ClassNotFoundException e) {
            System.out.println("Error ClassNotFoundException: "+e);
        }
    }  

    public Connection getConnected(){
      return conn;
    }

    public void Disconnect(){
      conn = null;
      System.out.println("conexion terminada");
    }     
}
