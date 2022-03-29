/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

/**
 *
 * @author miguel
 */
public abstract class Empleado extends Persona {
    protected String numeroSeguridadSocial;
    protected double salario;

    public Empleado() {
    }

    public Empleado(String numeroSeguridadSocial, double salario, String nombre, String apellido, NIF nif) {
        super(nombre, apellido, nif);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }

    public Empleado(String numeroSeguridadSocial, double salario) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Empleado{" + "numeroSeguridadSocial="
                + numeroSeguridadSocial + ", salario=" + salario + '}';
    }
    public abstract double calcularIRPF(); 
}
