/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nekixitodev.crudjspbiblioteca.dao;

import com.nekixitodev.crudjspbiblioteca.model.Editorial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Miguel Nequiz
 */
public class EditorialDao {
    public static boolean registrar(Editorial editorial){
        
        
        try {
            String sql = "INSERT INTO editoriales (nit, nombre, telefono, direccion, email, sitioweb) VALUES (?,?,?,?,?,?);";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, editorial.getNit());
            st.setString(2, editorial.getNombre());
            st.setString(3, editorial.getTelefono());
            st.setString(4, editorial.getDireccion());
            st.setString(5, editorial.getEmail());
            st.setString(6, editorial.getSitioWeb());
            
            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
            
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static ArrayList<Editorial> listar(){
        
        
        try {
            String sql = "SELECT * FROM editoriales;";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet resultado = st.executeQuery(sql);
            ArrayList<Editorial> listaEditorial = new ArrayList<>();
            Editorial editorial;
            String nit;
            String nombre;
            String telefono;
            String direccion;
            String email;
            String sitioWeb;
            
            while (resultado.next()) {
                nit = resultado.getString("nit");
                nombre = resultado.getString("nombre");
                telefono = resultado.getString("telefono");
                direccion = resultado.getString("direccion");
                email = resultado.getString("email");
                sitioWeb = resultado.getString("");
                
                editorial = new Editorial();
                editorial.setNit(nit);
                editorial.setNombre(nombre);
                editorial.setTelefono(telefono);
                editorial.setDireccion(direccion);
                editorial.setEmail(email);
                editorial.setSitioWeb(sitioWeb);
                
                
                
                listaEditorial.add(editorial);
            }
            
            return listaEditorial;
        } catch (SQLException ex) {
            return null;
        }
    }
}
