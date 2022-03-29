/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.palindromo;

/**
 *
 * @author miguel
 */
public class recursivo {

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

        if (palabra.length() == 0 || palabra.length() == 1) {
            return true;
        }
        if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1)) {
            return esPalindromo(palabra.substring(1, palabra.length() - 1));
        }
        return false;
    }

}
