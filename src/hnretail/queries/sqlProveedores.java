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
public class sqlProveedores {

    public String insertProveedores(){
        String sql = "insert into proveedor(nombreProveedor,direccionProveedor,telefono,paginaweb,email,nombreContacto) values (?,?,?,?,?,?)";
        return sql;
    }
    
}