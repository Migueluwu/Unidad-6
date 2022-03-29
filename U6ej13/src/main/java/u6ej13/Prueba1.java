/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u6ej13;

import java.util.ArrayList;

/**
 *
 * @author 34616
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> listaPersonas=new ArrayList<>();
        listaPersonas.add(new Profesor());
        listaPersonas.add(new Profesor());
        listaPersonas.add(new Estudiante());
        listaPersonas.add(new Estudiante());
        
        for(Persona aux: listaPersonas){
            aux.identificate();
            if(aux instanceof Profesor){
                System.out.println(((Profesor) aux).getEspecialidad());
            }
            if(aux instanceof Estudiante){
                System.out.println(((Estudiante) aux).getId());
            }
        }
    }
    
}
