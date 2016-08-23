/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnretail.queries;

/**
 *
 * @author abendezur
 */
public class sqlProductos {
    
    public String insertProductos(){
        String sql = "insert into producto(codigoBarra,nombreProducto,describeProd,precio_venta,precio_costo,cantidad,categoriaProd,proveedorProd) values(?,?,?,?,?,?,?,?)";
        return sql;
    }
}


