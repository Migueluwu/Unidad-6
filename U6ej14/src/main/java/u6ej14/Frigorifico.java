/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u6ej14;

/**
 *
 * @author 34616
 */
public class Frigorifico  extends Electrodomestico implements Silencioso {
    private double capacidad;

    public Frigorifico(double capacidad, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
    @Override
    public void silencio() {
        System.out.println("50db");
    }

    @Override
    public String toString() {
        return super.toString()+"Frigorifico{" + "capacidad=" + capacidad + '}';
    }

    
    
}
