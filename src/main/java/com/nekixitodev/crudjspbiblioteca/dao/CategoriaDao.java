/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nekixitodev.crudjspbiblioteca.dao;

import com.nekixitodev.crudjspbiblioteca.model.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenazu
 */
public class CategoriaDao {
    
    public static boolean registrar(Categoria categoria){
        
        
        try {
            String sql = "INSERT INTO categorias (nombre) VALUES (?);";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, categoria.getNombre());
            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
            
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static ArrayList<Categoria> listar(){
        
        
        try {
            String sql = "SELECT * FROM categorias;";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet resultado = st.executeQuery(sql);
            ArrayList<Categoria> listaCategorias = new ArrayList<>();
            Categoria cat;
            int codigo;
            String nombre;
            
            while (resultado.next()) {
                codigo = resultado.getInt("codigo");
                nombre = resultado.getString("nombre");
                
                cat = new Categoria(codigo,nombre);
                
                //System.out.println("---------");
                //System.out.println(aux.getCodigo());
                //System.out.println(aux.getNombre());
                //System.out.println("---------");
                listaCategorias.add(cat);
            }
            
            return listaCategorias;
        } catch (SQLException ex) {
            return null;
        }
    }
}
