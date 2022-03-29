/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa;

import herencia.Comida;
import herencia.Macarrones;
import herencia.MacarronesConTomate;
import herencia.Tortilla;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;

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
        ArrayList<Comida> lista=new ArrayList<>();
        //Conversiones implicitas
        lista.add(new Tortilla(false, 5, "Francia", LocalDate.of(2023, Month.MARCH, 1)));
        lista.add(new Tortilla(true, 4, "España", LocalDate.of(2022, Month.DECEMBER, 20)));
        lista.add(new Macarrones(true, true, "Italia", LocalDate.of(2021, Month.MARCH, 5)));
        lista.add(new Macarrones(true, true, "Italia", LocalDate.of(2030, Month.JANUARY, 7)));
        lista.add(new MacarronesConTomate(true, true, "España", LocalDate.of(2024, Month.MARCH, 15)));
        lista.add(new MacarronesConTomate(true, true, "España", LocalDate.of(2026, Month.OCTOBER, 10)));
        
        
        ordenarPorFecha(lista);
        for(Comida aux: lista){
            System.out.println(aux.toString());
        }
        
        //conversiones explicitas:
        for(Comida aux: lista){
            if(aux instanceof Tortilla){
                ((Tortilla) aux).añadirCebolla();//conversion explicita
                
            }
            if(aux instanceof Macarrones){
                ((Macarrones) aux).preparar();//conversion explicita
            }
            if(aux instanceof MacarronesConTomate){
                ((MacarronesConTomate) aux).añadirTomate();//conversion explicita
            }
        }
        for(Comida aux: lista){
            System.out.println(aux.preparacion());
        }

    }
    
     public static void ordenarPorFecha(ArrayList<Comida> lista){
         Collections.sort(lista,(c1,c2)->c1.getCaducidad().compareTo(c2.getCaducidad()));
    }
    
}
