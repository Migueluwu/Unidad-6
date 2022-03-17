/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehivulosherencia;

/**
 *
 * @author miguel
 */
public class Vehiculos {
    private String nombre;
    private String color;

    public Vehiculos(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAtributos() {
        return "Vehiculos{" + "nombre=" + nombre + ", color=" + color + '}';
    }
    
}
