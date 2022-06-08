/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nekixitodev.crudjspbiblioteca.model;

import java.io.Serializable;

/**
 *
 * @author lenazu
 */
public class Categoria implements Serializable{

    public Categoria() {
        this.codigo = 0;
        this.nombre = "";
    }

    public Categoria(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    
    
    private int codigo;
    private String nombre;

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
