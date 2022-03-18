/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej8;

import java.util.Random;

/**
 *
 * @author miguel
 */
public class Dado extends Azar {
    public Dado(){
        this.setPosibilidades(6);
    }

    @Override
    public int lanzar() {
       Random ale=new Random();
       return ale.nextInt(6)+1;
    }
}
