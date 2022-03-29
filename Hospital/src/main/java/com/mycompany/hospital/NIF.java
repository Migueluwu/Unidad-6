/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

import java.time.LocalDate;

/**
 *
 * @author miguel
 */
public class NIF {
    private String numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public NIF() {
    }

    public NIF(String numero, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
        this.letra=calcularLetra();
    }
    public char calcularLetra(){
     char[] listaLetra=new char[]{'T','R','W','A','G','M','Y',
         'F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
     return listaLetra[(Integer.valueOf(numero)%23)];
    }
    public void renovar(LocalDate fechaRenovacion){
        this.fechaCaducidad=fechaRenovacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad.plusYears(10);
    }

    @Override
    public String toString() {
        return "NIF{" + "numero=" + numero + ", letra=" + letra + ", fechaCaducidad=" + fechaCaducidad + '}';
    }
    
}
