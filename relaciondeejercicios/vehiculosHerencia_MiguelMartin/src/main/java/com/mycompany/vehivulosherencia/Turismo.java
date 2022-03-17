/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehivulosherencia;

/**
 *
 * @author miguel
 */
public class Turismo extends Vehiculos{
    private int puertas;
    private boolean marchaAutomatica;

    public Turismo(int puertas, boolean marchaAutomatica, String nombre, String color) {
        super(nombre, color);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    public String getAtributos(){
        return "marchas automaticas: "+this.marchaAutomatica+"numero puertas"+this.puertas+super.getAtributos();
    }
}
