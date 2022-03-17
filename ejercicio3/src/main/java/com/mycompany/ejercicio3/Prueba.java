/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author miguel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personas p1=new Personas();
        p1=new Programador();
        System.out.println(p1.toString());
        p1=new Personas();
        System.out.println(p1.toString());
        Programador p2=new Programador();
        //p2=new Personas(); no deja ir hacia atras
        p2.aumentarSalario(20);
//        System.out.println(p2.toString());
    }
    
}
