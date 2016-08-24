/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnretail.dml;

import hnretail.dbutils.dbConn;
import hnretail.model.Producto;
import hnretail.queries.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;

/**
 *
 * @author abendezu
 */
public class dataAccess {
    
    private final dbConn conn;
    PreparedStatement ps;
    ResultSet res;  
    sqlProductos sql;
    
    public dataAccess() {
        conn = new dbConn();
    }   
    
    public boolean registra_producto(Producto prod){
        boolean estado = false;
            try {
                sql = new sqlProductos();
                ps = conn.getConnected().prepareStatement(sql.insertProductos());
                ps.setString(1, prod.getCodigoBarra());
                ps.setString(2, prod.getNombreProducto());
                ps.setString(3, prod.getDescripProd());
                ps.setDouble(4, prod.getPrecioVenta());
                ps.setDouble(5, prod.getPrecioCosto());
                ps.setInt(6, prod.getCantidad());
                ps.setInt(7, prod.getCategoriaProd());
                ps.setInt(8, prod.getProveedorProd());
                ps.executeUpdate();
                ps.close();
                conn.Disconnect();
                estado = true;
            }catch(SQLException e){
                System.out.println("Error al Guardar: "+ ps +e);
                return false;
            }
       return estado;
    }

    public Object[] fill_combox(String tabla, String campo){
        int registros = 0;
        genericSql sqlSentence = new genericSql();
        try{
            ps = conn.getConnected().prepareStatement(sqlSentence.cuantos(tabla));
            res = ps.executeQuery();
            res.next();
            registros = res.getInt(1); 
            res.close();
        }catch(SQLException e){
            System.out.println(e);
        }

        Object[] valores = new Object[registros];
        try{
            ps = conn.getConnected().prepareStatement(sqlSentence.selectCampo(campo, tabla));
            res = ps.executeQuery();
            int i = 0;
            while(res.next()){
                valores[i] = res.getObject(1); 
                i++;
            }
            res.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return valores;
    }

    
}
    

    
