/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej12;

import java.util.ArrayList;

/**
 *
 * @author miguel
 */
public class Ej12 {

    public static void main(String[] args) {
        ArrayList<Cuenta> cuentasBancarias=new ArrayList<>();
        cuentasBancarias.add(new CuentaAhorro(0.02, 100, new Persona("miguel", "uwu", "12345")));
        cuentasBancarias.add(new CuentaCorriente(0.04, 200, new Persona("JJ","asdasd","78945")));
        for(Cuenta aux : cuentasBancarias){
            System.out.println(aux.toString());
        }
        cuentasBancarias.get(0).setSaldo(5000);
        cuentasBancarias.get(1).setSaldo(2000);
        
        for(Cuenta aux : cuentasBancarias){
            aux.actualizarSaldo();
        }
        cuentasBancarias.get(1).retirar(1010);
        
        for(Cuenta aux : cuentasBancarias){
            System.out.println(aux.toString());
        }
    }
}
