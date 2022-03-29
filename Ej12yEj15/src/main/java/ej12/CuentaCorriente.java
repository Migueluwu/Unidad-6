/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author miguel
 */
public class CuentaCorriente extends Cuenta {
    private double interes;
    private double saldoMin;

    public CuentaCorriente(double interes, double saldoMin, Persona persona) {
        super(persona);
        this.interes = interes;
        this.saldoMin = saldoMin;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    @Override
    public void actualizarSaldo() {
        if(this.getSaldo()>1000){
            this.setSaldo(this.getSaldo()+(this.saldoMin*this.interes));
        }else{
            this.setSaldo(this.getSaldo()+(this.getSaldo()*this.interes));
        }
    }

    @Override
    public void retirar(double saldo) {
        if(this.getSaldo()-saldo<this.saldoMin){
            System.out.println("Error");
        }else{
            this.setSaldo(this.getSaldo()-saldo);
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "interes=" + interes + ", saldoMin=" 
                + saldoMin + "\n, saldo="+this.getSaldo()+", numCuenta ="+this.getNumeroCuenta()
                        +this.getPersona()+'}';
    }


    
}
