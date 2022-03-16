/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.u6ej11;

/**
 *
 * @author 34616
 */
public class Figura {
 
        protected double base;
        protected double altura;

    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return this.base*this.altura;
    }

 
}
