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
public class Triangulo extends Figura{

    public Triangulo(double base, double altura) {
        super(base, altura);
    }
    public double calcularArea(){
        return(this.base*this.altura)/2;
    }
}
