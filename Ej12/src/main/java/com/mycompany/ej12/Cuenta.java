/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej12;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author miguel
 */
public abstract class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Persona persona;
    private static Set<String> lista= new HashSet<>();
    public Cuenta(Persona persona) {
        this.persona = persona;
        this.saldo=0;
        generarNumeroCuenta();
    }
    public void generarNumeroCuenta(){
        boolean noRepite;
        do{
            
            String num="";
            Random ale=new Random();
            for(int i=0;i<20;i++){
                num=num+ale.nextInt(10);
            }
            if(lista.contains(num)){
                noRepite=false;
            }else{
                noRepite=true;
                lista.add(num);
                this.numeroCuenta=num;
            }
            
        }while(noRepite=false);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public abstract void actualizarSaldo();
    
    public abstract void retirar(double saldo);
        

}
