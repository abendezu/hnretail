/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnretail.dbutils;

import hnretail.queries.genericSql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author abendezur
 */
public class testConn {
 
    private dbConnTest conn;
    PreparedStatement ps;
    ResultSet res;      
    
    public testConn() throws Exception {
            conn = new dbConnTest();
    }   
    
    public boolean canConnect(String tabla) throws Exception{
        boolean conecto = false;
        int registros = 0;
        genericSql sqlSentence = new genericSql();
            ps = conn.getConnected().prepareStatement(sqlSentence.cuantos(tabla));
            res = ps.executeQuery();
            if(res.next()){
                registros = res.getInt(1);
                conecto = true;
            }            
            res.close();
        return conecto;
    }
    
}
