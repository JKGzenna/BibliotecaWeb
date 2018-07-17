package models;

import java.io.Serializable;

/**
 *
 * @author jlGoldaracena
 */
public class Editorial implements Serializable {
    
    private String nit;
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private String sitioweb;

    public Editorial() {
        this.nit = "";
        this.nombre = "";
        this.telefono = "";
        this.direccion = "";
        this.email = "";
        this.sitioweb = "";
    }

    public Editorial(String nit, String nombre, String telefono, String direccion, String email, String sitioweb) {
        
        this.nit = nit;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.sitioweb = sitioweb;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSitioweb() {
        return sitioweb;
    }

    public void setSitioweb(String sitioweb) {
        this.sitioweb = sitioweb;
    }

    
}
