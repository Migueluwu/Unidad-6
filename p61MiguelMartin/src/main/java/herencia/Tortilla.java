/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.time.LocalDate;

/**
 *
 * @author miguel
 */
public class Tortilla extends Comida{ //CLASE C
    private boolean conCebolla;
    private int huevos;

    public Tortilla() {
    }

    public Tortilla(boolean conCebolla, int huevos) {
        this.conCebolla = conCebolla;
        this.huevos = huevos;
    }

    public Tortilla(boolean conCebolla, int huevos, String procedencia, LocalDate caducidad) {
        super(procedencia, caducidad);
        this.conCebolla = conCebolla;
        this.huevos = huevos;
    }
    public void añadirCebolla(){ //metodo C
        this.conCebolla=true;
        
    }

    public boolean isConCebolla() {
        return conCebolla;
    }

    public int getHuevos() {
        return huevos;
    }
    
    @Override
    public String preparacion() {//metodoAbstractoA
        return "Freimos las patatas y cuando esten doradas añadimos los huevos y la cebolla";
    }

    @Override
    public int hashCode() {
        
        int hash = 7;
        hash = 61 * hash + (this.conCebolla ? 1 : 0);
        hash = 61 * hash + this.huevos;
        hash= 61* hash + super.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)){
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tortilla other = (Tortilla) obj;
        if (this.conCebolla != other.conCebolla) {
            return false;
        }
        return this.huevos == other.huevos;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Tortilla{" + "conCebolla=" + conCebolla + ", huevos=" + huevos + '}';
    }
    
    
    
}
