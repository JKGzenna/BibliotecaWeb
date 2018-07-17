package models;

import java.io.Serializable;

/**
 *
 * @author jlGoldaracena
 */
public class Libro implements Serializable{
   
    private String isbn;
    private String titulo;
    private String descripcion;
    private String nombre_autor;
    private String publicacion;
    private String fecha_registro;
    private int codigo_categoria;  
    private String nit_editorial;

    public Libro() {
        
        this.isbn = "";
        this.titulo = "";
        this.descripcion = "";
        this.nombre_autor = "";
        this.publicacion = "";
        this.fecha_registro = "";
        this.codigo_categoria = 0;
        this.nit_editorial = "";
    }

    public Libro(String isbn, String titulo, String descripcion, String nombre_autor, String publicacion, String fecha_registro, int codigo_categoria, String nit_editorial) {
        
        this.isbn = isbn;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.nombre_autor = nombre_autor;
        this.publicacion = publicacion;
        this.fecha_registro = fecha_registro;
        this.codigo_categoria = codigo_categoria;
        this.nit_editorial = nit_editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre_autor() {
        return nombre_autor;
    }

    public void setNombre_autor(String nombre_autor) {
        this.nombre_autor = nombre_autor;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public int getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(int codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public String getNit_editorial() {
        return nit_editorial;
    }

    public void setNit_editorial(String nit_editorial) {
        this.nit_editorial = nit_editorial;
    }
        
        
       
    
}
