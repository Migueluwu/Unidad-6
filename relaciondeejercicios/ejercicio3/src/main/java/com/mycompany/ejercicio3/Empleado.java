/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author miguel
 */
public class Empleado extends Personas {
    private int salario;

    public Empleado(int salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public Empleado() {
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public void aumentarSalario(int aumento){
        this.salario=this.salario+aumento;
    }

    @Override
    public String toString() {
        return "Empleado{" + "salario=" + salario +super.toString()+ '}';
    }
}
