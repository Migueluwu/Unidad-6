/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelo;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author 34616
 */
public class Vuelo implements Comparable<Vuelo>{
   private String codVuelo;
   private String ciudadOrigen;
   private String ciudadDestino;
   private double duracionVuelo;
   private ArrayList<Pasajero> listaPasajero; 

    public Vuelo() {
        listaPasajero=new ArrayList<>();
    }

    public Vuelo(String codVuelo, String ciudadOrigen, String ciudadDestino, double duracionVuelo) {
        this.codVuelo = codVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.duracionVuelo = duracionVuelo;
        listaPasajero=new ArrayList<>();
                
    }

    public String getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(String codVuelo) {
        this.codVuelo = codVuelo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getDuracionVuelo() {
        return duracionVuelo;
    }

    public void setDuracionVuelo(double duracionVuelo) {
        this.duracionVuelo = duracionVuelo;
    }

    public ArrayList<Pasajero> getListaPasajero() {
        return listaPasajero;
    }

    public void setListaPasajero(ArrayList<Pasajero> listaPasajero) {
        this.listaPasajero = listaPasajero;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "codVuelo=" + codVuelo + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", duracionVuelo=" + duracionVuelo + ", listaPasajero=" + listaPasajero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.codVuelo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vuelo other = (Vuelo) obj;
        if (!Objects.equals(this.codVuelo, other.codVuelo)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Vuelo o) {
        return this.hashCode()-o.hashCode();
    }
    
}
 /* Tenemos la clase vuelo con 5 atributos, codigo de vuelgo, ciudad origen, ciudad destino, duracion vuelo
    lista pasajeros.
 Un main que genere una lista de vuelos y añadir un metodo statico que devuelva un map, 
ese map contiene para cada destino el numero de pasajeros que llegan a ese destino(de todos los vuelos)

un metodo igual que el anterior pero que devuleva los mismo pero los destinos ordenados alfabeticamente

3º que permita saber por codigo de vuelo los pasajeros que hay.

*/