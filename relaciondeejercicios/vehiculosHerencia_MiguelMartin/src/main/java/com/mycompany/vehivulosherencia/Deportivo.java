/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehivulosherencia;

/**
 *
 * @author miguel
 */
public class Deportivo extends Vehiculos {

private int cilindrada; // Atributo específico para Deportivo

    public Deportivo(int cilindrada, String nombre, String color) {
        super(nombre, color);
        this.cilindrada = cilindrada;
    }

    @Override
    public String getAtributos() {
        return "Deportivo{" + "cilindrada=" + cilindrada +super.getAtributos() +'}';
    }

    public int getCilindrada() {
        return cilindrada;
    }



}
