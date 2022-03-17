/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author miguel
 */
public class Programador extends Empleado {

    private Categoria categoria;

    public Programador(Categoria categoria, int salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.categoria = categoria;
    }

    public Programador() {
    }

    public Programador(int salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Programador{" + "categoria=" + categoria + super.toString()+'}';
    }
}
