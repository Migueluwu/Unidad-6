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
public class Microondas extends Electrodomestico implements Silencioso, Comparable<Microondas>{
    private int potenciaMax;

    public Microondas(int potenciaMax, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaMax = potenciaMax;
    }
    
    @Override
    public void silencio() {
        System.out.println("40db");
    }

    public int getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    @Override
    public String toString() {
        return super.toString()+"Microondas{" + "potenciaMax=" + potenciaMax + '}';
    }

    @Override
    public int compareTo(Microondas t) {
        return this.potenciaMax-t.potenciaMax;
    }
    
}
