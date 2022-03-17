/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehivulosherencia;

/**
 *
 * @author miguel
 */
public class Furgoneta extends Vehiculos {
    private int carga;
    private int volumen;

    public Furgoneta(int carga, int volumen, String nombre, String color) {
        super(nombre, color);
        this.carga = carga;
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Furgoneta{" + "carga=" + carga + ", volumen=" + volumen +super.getAtributos()+ '}';
    }
}
