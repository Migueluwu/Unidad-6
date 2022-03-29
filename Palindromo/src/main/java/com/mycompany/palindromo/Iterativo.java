/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.palindromo;

/**
 *
 * @author miguel
 */
public class Iterativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(esPalindromo("HolaloH"));
        System.out.println(esPalindromo("HolaaloH"));
        System.out.println(esPalindromo("HoolaloH"));
    }

    private static boolean esPalindromo(String palabra) {
        for(int i=0;i<palabra.length()/2;i++){
            if(palabra.charAt(i)!=palabra.charAt(palabra.length()-(i+1))){
                return false;
            }
            
        }
        return true;
    }

}
