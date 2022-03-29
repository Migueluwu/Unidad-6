/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.hospital;

/**
 *
 * @author miguel
 */
public enum Grupo {
    GRUPOC(17.5),GRUPOD(18),GRUPOE(18.5);
    private double irpf;
    private Grupo(double irpf){
        this.irpf=irpf;
    }

    public double getIrpf() {
        return irpf;
    }

    @Override
    public String toString() {
        return "Grupo{" + "irpf=" + irpf + '}';
    }
}
