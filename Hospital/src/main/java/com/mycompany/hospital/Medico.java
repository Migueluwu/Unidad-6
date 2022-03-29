/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

/**
 *
 * @author miguel
 */
public class Medico extends Empleado{
    private String especialidad;
    private static final double irpfCirugano=25;
    private static final double irpfNormal=23.5;
    public Medico() {
    }

    public Medico(String especialidad) {
        this.especialidad = especialidad;
    }

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellido, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellido, nif);
        this.especialidad = especialidad;
    }

    public Medico(String especialidad, String numeroSeguridadSocial, double salario) {
        super(numeroSeguridadSocial, salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public double calcularIRPF() {
        if(especialidad.equalsIgnoreCase("cirugia")){
            return (this.salario*irpfCirugano)/100;
        }else{
            return (this.salario*irpfNormal)/100;
        }
    }
    public void tratarPaciente(Paciente paciente,String medicina){
        System.out.println("El medico "+this.nombre+" "+this.apellido
                +"trata al pacicente "+paciente.nombre+" "+paciente.apellido 
                +"con la medicina "+medicina);
    }
    @Override
    public String toString() {
        return super.toString()+"\n Medico{" + "especialidad=" + especialidad + '}';
    }
    
}
