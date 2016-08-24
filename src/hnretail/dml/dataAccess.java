/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnretail.dml;

import hnretail.dbutils.dbConn;
import hnretail.model.Producto;
import hnretail.model.Proveedor;
import hnretail.queries.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
    
    public dataAccess() {
        conn = new dbConn();
    }   
    
    public boolean registra_producto(Producto prod){
        boolean estado = false;
            try {
                sqlProductos sql = new sqlProductos();
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
                //conn.Disconnect();
                estado = true;
            }catch(SQLException e){
                System.out.println("Error al Guardar: "+ ps +e);
                return false;
            }
       return estado;
    }

    public boolean registra_proveedor(Proveedor prov){
        boolean estado = false;
            try {
                sqlProveedores sql = new sqlProveedores();
                ps = conn.getConnected().prepareStatement(sql.insertProveedores());
                ps.setString(1, prov.getNombre());
                ps.setString(2, prov.getDireccion());
                ps.setString(3, prov.getTelefono());
                ps.setString(4, prov.getWebpage());
                ps.setString(5, prov.getEmail());
                ps.setString(6, prov.getContacto());
                ps.executeUpdate();
                ps.close();
                //conn.Disconnect();
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
            System.out.println(ps);
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
            System.out.println(ps);
            res = ps.executeQuery();
            int i = 0;
            while(res.next()){
                //valores[i] = res.getObject(1); 
                valores[i] = res.getString(1);
                i++;
            }
            res.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return valores;
    }
    
    
    public Object[][] fill_table(String tabla, String campo){
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

        Object[][] data = null;
    
        try{
            ps = conn.getConnected().prepareStatement(sqlSentence.selectCampo(campo, tabla));
            System.out.println("Este es el query "+ps);            
            res = ps.executeQuery();
            System.out.println("prov1");
            ResultSetMetaData rsmd = res.getMetaData();
            System.out.println("prov2");            
            int colLength = rsmd.getColumnCount();            
            System.out.println("prov3 y el colLenght es "+colLength);            
            int i = 0;
            System.out.println("prov4");            
            data = new String[registros][colLength];
            System.out.println("prov5 y registros es "+registros);            
            while(res.next()){
                System.out.println("Entra al While");
                for(int j=0; j<=colLength-1;j++){
                    System.out.println("Entra al FOR con i="+i+" y j="+j);
                    data[i][j] = res.getString(j+1); 
                }
                i++;
            }
            res.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
    
    public void cierra_Acceso(){
        conn.Disconnect();
    }
    
}
    

    
