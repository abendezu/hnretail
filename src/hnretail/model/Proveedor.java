package hnretail.model;

/**
 *
 * @author abendezu
 */
public class Proveedor {
    
    private int codigo_proveedor;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String webpage;
    private String contacto;

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getWebpage() {
        return webpage;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
    }   
    
    public int getCodigo_proveedor() {
        return codigo_proveedor;
    }

    public void setCodigo_proveedor(int codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}