/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej12;

/**
 *
 * @author miguel
 */
public class CuentaAhorro extends Cuenta {

    private double interes;
    private double ComisionAnual;

    public CuentaAhorro(double interes, double ComisionAnual, Persona persona) {
        super(persona);
        this.interes = interes;
        this.ComisionAnual = ComisionAnual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return ComisionAnual;
    }

    public void setComisionAnual(double ComisionAnual) {
        this.ComisionAnual = ComisionAnual;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "interes=" + interes + ", ComisionAnual=" + ComisionAnual +
                "\n, saldo="+this.getSaldo()+", numCuenta ="+this.getNumeroCuenta()
                        +this.getPersona()+'}';
    }

 
    @Override
    public void actualizarSaldo() {
      this.setSaldo(this.getSaldo()+(this.getSaldo()*this.interes)-this.ComisionAnual);
    }

    @Override
    public void retirar(double saldo) {
        if (this.getSaldo() - saldo < 0) {
            System.out.println("Error");
        } else {
            this.setSaldo(this.getSaldo() - saldo);
        }
    }
}
