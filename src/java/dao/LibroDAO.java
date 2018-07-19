package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Libro;

/**
 *
 * @author jlGoldaracena
 */
public class LibroDAO {
    
    public static boolean registrar(Libro l){
        try{
            String SQL="INSERT INTO libros values(?,?,?,?,?,(select now()),?,?);";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(SQL);
            st.setString(1, l.getIsbn());
            st.setString(2, l.getTitulo());
            st.setString(3, l.getDescripcion());
            st.setString(4, l.getNombre_autor());
            st.setString(5, l.getPublicacion());
            st.setInt(6, l.getCodigo_categoria());
            st.setString(7, l.getNit_editorial());
            if(st.executeUpdate()>0){
                return true;
                
            }else{
                return false;
            }
        }catch (SQLException ex) {
            return false;
          
        }
    }
    
    public static boolean actualizar (Libro l){
        try {
            String SQL = "UPDATE libros SET" +
                     "    titulo=?," +
                     "    descripcion=?," +
                     "    nombre_autor=?," +
                     "    publicacion=?," +
                     "    codigo_categoria=?," +
                     "    nit_editorial=? " +
                "    WHERE isbn=?";
//          String SQL = "UPDATE libros SET titulo = ?, descripcion = ?, nombre_autor = ?, publicacion = ?, codigo_categoria = ?, nit_editorial = ? where isbn = ?";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement (SQL); 
            
            st.setString(1, l.getTitulo());
            st.setString(2, l.getDescripcion());
            st.setString(3, l.getNombre_autor());
            st.setString(4, l.getPublicacion()); 
            st.setInt(5, l.getCodigo_categoria());
            st.setString(6, l.getNit_editorial());
            st.setString(7, l.getIsbn());
            if(st.executeUpdate()>0){
                
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
    public static boolean eliminar (Libro l){
        try {
            String SQL = "DELETE FROM libros WHERE isbn=?";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement (SQL); 
            st.setString(1, l.getIsbn());
            if(st.executeUpdate()>0){
                
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
    
        public static ArrayList<Libro> listar(){
        try {
            String SQL = "SELECT * FROM libros;";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement (SQL); 
            ResultSet resultado = st.executeQuery();
            ArrayList<Libro>lista = new ArrayList<>();
            Libro lib;
            while(resultado.next()){
                lib = new Libro();
                lib.setIsbn(resultado.getString("isbn"));
                lib.setTitulo(resultado.getString("titulo"));
                lib.setNombre_autor(resultado.getString("nombre_autor"));
                lib.setDescripcion(resultado.getString("descripcion"));
                lib.setPublicacion(resultado.getString ("publicacion"));
                lib.setFecha_registro(resultado.getString("fecha_registro"));
                lib.setCodigo_categoria(resultado.getInt("codigo_categoria"));
                lib.setNit_editorial(resultado.getString("nit_editorial"));
                lista.add(lib);
            }
            return lista;

        } catch (SQLException ex) {
            return null;
        }
    } 
        
}
