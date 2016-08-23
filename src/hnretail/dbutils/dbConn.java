/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnretail.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author abendezu
 */
public class dbConn {
    
   
   private final String url = "jdbc:mysql://localhost/hnretail";
   PreparedStatement ps;
   Connection con = null;

   public dbConn() {
     try{  
         
         Class.forName("com.mysql.jdbc.Driver");
         
         con = DriverManager.getConnection(url,"hnretail","hnretail");
         if (con!=null){
            System.out.println("Conexion a Base de Datos lista");
         }

     } catch(SQLException e) {
         System.out.println(e);
     } catch(ClassNotFoundException e) {
          System.out.println(e);
     }
   }
   
    public Connection conectado(){
      return con;
    }

    public void desconectar(){
      con = null;
      System.out.println("conexion terminada");
    } 
    
}
