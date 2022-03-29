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
public abstract class Persona {
   protected String nombre;
   protected String apellido;
   protected NIF nif;

    public Persona(String nombre, String apellido, NIF nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
    }
    public Persona() {
    }
    final public void renovarNIF(LocalDate fechaRenovacion){
        this.nif.renovar(fechaRenovacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + "\n nif=" + nif + '}';
    }
    
}
