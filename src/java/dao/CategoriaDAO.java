package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Categoria;

/**
 *
 * @author jlGoldaracena
 */
public class CategoriaDAO {
    public static boolean registrar(Categoria c){
        try {
            String SQL="INSERT INTO categorias(nombre) values(?);";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(SQL);
            st.setString(1, c.getNombre());
            if(st.executeUpdate()>0) {
                return true;
        }else{
                return false;
                }
                
        } catch (SQLException ex) {
            return false;
        }
        
    }
        public static ArrayList<Categoria> listar(){
        try {
            String SQL="SELECT * FROM categorias";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(SQL);
            ResultSet resultado = st.executeQuery();
            ArrayList<Categoria> lista = new ArrayList<>();
            Categoria cat;
            while(resultado.next()){
                cat = new Categoria();
                cat.setCodigo(resultado.getInt("codigo"));
                cat.setNombre(resultado.getString("nombre"));
                lista.add(cat);
            }
            return lista;

        } catch (SQLException ex) {
            
            return null;
            
        }
        
    }
}
