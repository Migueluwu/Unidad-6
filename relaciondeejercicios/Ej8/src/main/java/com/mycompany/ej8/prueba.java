/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ej8;

/**
 *
 * @author miguel
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Azar p1=new Azar(); no se puede
          Azar p1=new Moneda();
          System.out.println(p1.getPosibilidades());
          System.out.println(p1.lanzar());
          p1=new Dado();
          System.out.println(p1.lanzar());
          System.out.println(p1.getPosibilidades());
          
    }
    
}
