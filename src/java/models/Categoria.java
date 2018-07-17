package models;

import java.io.Serializable;

/**
 *
 * @author jlGoldaracena
 */
public class Categoria implements Serializable {
    
    private int codigo;
    private String nombre;
    
    public Categoria() {
        this.codigo =  0;
        this.nombre = "";
    }
    
    public Categoria(int codigo, String nombre) {
        this.codigo =  codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    
        
    }
    

