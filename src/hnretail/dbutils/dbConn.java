/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnretail.dbutils;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;

/**
 *
 * @author abendezu
 */
public class dbConn {
       
    private String URL;// = "jdbc:mysql://172.21.1.158/hnretail";
    private String Driver;
    private String Username;
    private String Password;
    Connection conn = null;
   
    public dbConn() {
        
        try{
            
            String path = System.getProperty("user.dir");
            //System.out.println(path+"\\src\\utils");
            File propertiesFile = new File(path+"\\src\\utils\\connection.properties");
        
            FileReader fileReader = new FileReader(propertiesFile);

            Properties props = new Properties();
            props.load(fileReader);
            
            Driver = props.getProperty("database.driver");
            URL = props.getProperty("database.url");
            Username = props.getProperty("database.user");
            Password = props.getProperty("database.password");        
            
        } catch(Exception e){
            System.out.println(e);
        }
        
        try{  
            Class.forName(Driver);
            conn = DriverManager.getConnection(URL,Username,Password);
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
