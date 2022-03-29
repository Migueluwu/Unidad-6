/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

import java.util.Random;

/**
 *
 * @author miguel
 */
public class Paciente extends Persona{
    private String numeroHistorias;

    public Paciente() {
    }

    public Paciente(String numeroHistorias, String nombre, String apellido, NIF nif) {
        super(nombre, apellido, nif);
        this.numeroHistorias = numeroHistorias;
    }

    public Paciente(String numeroHistorias) {
        this.numeroHistorias = numeroHistorias;
    }

    public String getNumeroHistorias() {
        return numeroHistorias;
    }

    public void setNumeroHistorias(String numeroHistorias) {
        this.numeroHistorias = numeroHistorias;
    }
    public void tomarMedicina(String medicina){
        Random ale=new Random();
        System.out.println((ale.nextBoolean())?"Se ha curado":"No se ha curao");
    }

    @Override
    public String toString() {
        return super.toString()+"\n Paciente{" + "numeroHistorias=" + numeroHistorias + '}';
    }
}
