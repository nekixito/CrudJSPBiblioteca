/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nekixitodev.crudjspbiblioteca.dao;

import com.nekixitodev.crudjspbiblioteca.model.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Miguel Nequiz
 */
public class LibroDao {
    public static boolean registrar(Libro libro){      
        try {
            String sql = "INSERT INTO libros VALUES (?,?,?,?,?,(select now()),?,?);";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, libro.getIsbn());
            st.setString(2, libro.getTitulo());
            st.setString(3, libro.getDescripcion());
            st.setString(4, libro.getNombreAutor());
            st.setString(5, libro.getPublicacion());
            st.setInt(6, libro.getCodigoCategoria());
            st.setString(7, libro.getNitEditorial());
            
            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
            
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static ArrayList<Libro> listar(){
        try {
            String sql = "SELECT * FROM libros;";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet resultado = st.executeQuery(sql);
            ArrayList<Libro> listaLibros = new ArrayList<>();
            Libro libro;
            
            while (resultado.next()) {
                
                libro = new Libro();
                libro.setIsbn(resultado.getString("isbn"));
                libro.setTitulo(resultado.getString("titulo"));
                libro.setDescripcion(resultado.getString("descripcion"));
                libro.setNombreAutor(resultado.getString("nombre_autor"));
                libro.setPublicacion(resultado.getString("publicacion"));
                libro.setCodigoCategoria(resultado.getInt("codigo_categoria"));
                libro.setNitEditorial(resultado.getString("nit_editorial"));

                listaLibros.add(libro);
            }
            
            return listaLibros;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static boolean actualizar(Libro libro){      
        try {
            String sql = "UPDATE libro SET " +
                "	titulo = ?," +
                "	descripcion = ?," +
                "	nombre_autor = ?," +
                "	publicacion = ?," +
                "	codigo_categoria = ?," +
                "	nit_editorial = ?" +
                "       WHERE isbn = ?;";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(7, libro.getIsbn());
            st.setString(1, libro.getTitulo());
            st.setString(2, libro.getDescripcion());
            st.setString(3, libro.getNombreAutor());
            st.setString(4, libro.getPublicacion());
            st.setInt(5, libro.getCodigoCategoria());
            st.setString(6, libro.getNitEditorial());
            
            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
            
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static boolean eliminar(Libro libro){      
        try {
            String sql = "DELETE FROM libros WHERE isbn = ?;";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, libro.getIsbn());
            
            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
            
        } catch (SQLException ex) {
            return false;
        }
    }
}
