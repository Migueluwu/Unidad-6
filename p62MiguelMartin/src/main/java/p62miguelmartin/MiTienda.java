/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p62miguelmartin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author miguel
 */
public class MiTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Producto> listaProductos= new ArrayList<>();
        //conversiones implicitas
        listaProductos.add(new Pantalon("M", "Springfield", "123123", 30, 21, "Patalon negro"));
        listaProductos.add(new Pantalon("XL", "Primark", "456321", 20, 21, "Patalon vaquero azul"));
        listaProductos.add(new Musica("Rosalia","452145", 15, 11, "Disco Motomami"));
        listaProductos.add(new Musica("C tangana","985698", 19, 11, "Disco El madrileño"));
        listaProductos.add(new LibroPapel(250, "75324", "45268", 10, 6, "Harry Potter y la piedra filosofal"));
        listaProductos.add(new LibroPapel(425, "836018", "89768", 30, 6, "El señor de los anillos, las 2 torres"));
        listaProductos.add(new LibroDigital(120, "11122", "114422", 15, 10, "Guia de programacion orientada a objetos"));
        listaProductos.add(new LibroDigital(163, "991133", "994422", 15, 10, "Nacidos de la bruma"));
        
        
        for (Producto aux : listaProductos) {
            System.out.println(aux.toString());
        }
        //toString es un metodo polimorfico porque se invoca al metodo desde objetos con
        //diferente clase y el resultado es diferente para cada clase
        
        ordenarPorPrecio(listaProductos);
        for(Producto aux: listaProductos){
            System.out.println(aux.codigo+"-->"+aux.precio);
        }
        
        
        ordenarPorCodigo(listaProductos);
        for(Producto aux: listaProductos){
            System.out.println(aux.codigo);
        }
        
        System.out.println(busquedaPorCodigo(listaProductos,new Musica("asda", "452145", 0, 0, "")));
        
        ArrayList<Libro> listaLibro=new ArrayList<>();
        for(Producto aux: listaProductos){
            if(aux instanceof Libro){
                listaLibro.add((Libro) aux);//conversion explicita
            }
        }
        
        for(Libro aux: listaLibro){
            System.out.println(aux.toString());
        }
        
        ordenarPorIsbn(listaLibro);
         for(Libro aux: listaLibro){
            System.out.println(aux.toString());
        }
        
        
        for(Libro aux: listaLibro){
            if(aux instanceof LibroDigital){
                ((LibroDigital) aux).descargar(); //conversion explicita
            }
            if(aux instanceof LibroPapel){
                ((LibroPapel) aux).enviar("Calle profe apruebame por favor");//conversion explicita
            }
        }
        
        
        System.out.println(listaLibro.contains(
                new LibroDigital(163,"991133", "994422", 15, 10, "Nacidos de la bruma")));
        
        ArrayList<SeEnvia> listaSeEnvia=new ArrayList<>();
        for(Producto aux: listaProductos){
            if(aux instanceof SeEnvia){
                listaSeEnvia.add((SeEnvia)aux);// Conversion explicita
            }
        }
        
        for(SeEnvia aux: listaSeEnvia){
            aux.enviar("Aqui");
        }
            
        //Ya he creado el metodo abstracto para Libro, ahora lo voy a ejecutar
        for(Libro aux: listaLibro){
            aux.leerLibro();
        }
            
    }
    private static void ordenarPorPrecio(ArrayList<Producto> listaProductos){
        Collections.sort(listaProductos,(Producto p1, Producto p2)->(int)(p1.getPrecio()-p2.getPrecio()));
    }
    private static void ordenarPorCodigo(ArrayList<Producto> listaProductos){
        Collections.sort(listaProductos,(Producto p1, Producto p2)->p1.getCodigo().compareToIgnoreCase(p2.getCodigo()));
    }
    private static int busquedaPorCodigo(ArrayList<Producto> listaProductos, Producto p){
        ordenarPorCodigo(listaProductos);
        Comparator<Producto> criterio=(Producto p1, Producto p2)->p1.getCodigo().compareToIgnoreCase(p2.getCodigo());
        return Collections.binarySearch(listaProductos, p,criterio);
    }
    private static void ordenarPorIsbn(ArrayList<Libro> listaLibros){
        Collections.sort(listaLibros);
    }
    
    
    
}
