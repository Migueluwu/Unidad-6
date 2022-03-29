/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

import java.util.ArrayList;

/**
 *
 * @author miguel
 */
public class Hospital {

    private String nombre;
    private String direccion;
    private int numeroCamas;
    ArrayList<Paciente> listaPacientes = new ArrayList<>();
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public Hospital() {
    }

    public Hospital(String nombre, String direccion, int numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    
    
    
    
    public void contratarEmpleado(Empleado emp){
        listaEmpleados.add(emp);
    }
    
    public void ingresarPaciente(Paciente paciente){
        if(listaEmpleados.size()<=numeroCamas){
            listaPacientes.add(paciente);
        }else{
            System.out.println("No hay camas disponibles");
        }
    }

    @Override
    public String toString() {
        return "Hospital{" + "nombre=" + nombre + ", direccion=" + direccion + ", numeroCamas=" + numeroCamas + ", listaPacientes=" + listaPacientes + ", listaEmpleados=" + listaEmpleados + '}';
    }
}
