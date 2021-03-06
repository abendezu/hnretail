package hnretail.model;

import java.util.Date;

/**
 *
 * @author abendezu
 */
public class Producto {
    
    private int codigoProducto;
    private String codigoBarra;
    private String nombreProducto;
    private double precioVenta;
    private double precioCosto;
    private int cantidad;
    private int categoriaProd;
    private int proveedorProd;
    private String descripProd;

    public String getDescripProd() {
        return descripProd;
    }

    public void setDescripProd(String descripProd) {
        this.descripProd = descripProd;
    }
    private Date fechaIngreso;

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCategoriaProd() {
        return categoriaProd;
    }

    public void setCategoriaProd(int categoriaProd) {
        this.categoriaProd = categoriaProd;
    }

    public int getProveedorProd() {
        return proveedorProd;
    }

    public void setProveedorProd(int proveedorProd) {
        this.proveedorProd = proveedorProd;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    
            
}