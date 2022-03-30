/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author 34616
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Vuelo> listavuelos=new ArrayList<>();
        listavuelos.add(new Vuelo("nosenose","malaga","madrid",1));
        listavuelos.add(new Vuelo("sisesise","estepona","barcelona",3));
        listavuelos.add(new Vuelo("123123","Malaga","Amsterdam",5));
        listavuelos.get(0).getListaPasajero().add(new Pasajero("Miguel","Martin","12115459"));
        
    }
    public HashMap<String, Vuelo> listaDesordenada(ArrayList<Vuelo> listaVuelos){
        Map<String, Vuelo> listaDesordenada=new HashMap<>();
        for(Vuelo aux: listaVuelos){
            listaDesordenada.put(aux.getCiudadDestino(), aux);
        }
        return listaDesordenada(listaVuelos);
    }
    
    public TreeMap<String, Vuelo> listaOrdenada(ArrayList<Vuelo> listaVuelos){
        Map<String, Vuelo> listaDesordenada=new TreeMap<>();
        for(Vuelo aux: listaVuelos){
            listaDesordenada.put(aux.getCiudadDestino(), aux);
        }
        return listaOrdenada(listaVuelos);
    }
}
