/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

/**
 *
 * @author miguel
 */
public class Administrativo extends Empleado{
    Grupo grupo;

    public Administrativo() {
    }

    public Administrativo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellido, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellido, nif);
        this.grupo = grupo;
    }

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario) {
        super(numeroSeguridadSocial, salario);
        this.grupo = grupo;
    }
    
    public void registrarDocumento(String nombreDoc){
        System.out.println("Administrativo: "+this.nombre+" "+this.apellido
                +"\n Nombre doc: "+nombreDoc+"\n Hash: "+nombreDoc.hashCode());
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    @Override
    public double calcularIRPF() {
        return (this.salario*this.grupo.getIrpf())/100;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Administrativo{" + "grupo=" + grupo + '}';
    }
    
 
}
