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
public class MacarronesConTomate extends Macarrones { //Clase D
    
    private boolean tomate;

    public MacarronesConTomate() {
        this.tomate=false;
    }

    public MacarronesConTomate(boolean hervido, boolean conQueso, String procedencia, LocalDate caducidad) {
        super(hervido, conQueso, procedencia, caducidad);
        this.tomate=false;
    }

    public MacarronesConTomate(boolean hervido, boolean conQueso) {
        super(hervido, conQueso);
        this.tomate=false;
    }

    public boolean isTomate() {
        return tomate;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }
    public void añadirTomate(){ //Metodo D
        this.tomate=true;
    }
    
    @Override
    public void preparar(){ //metodoB2
        super.hervido=true;
        this.tomate=true;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"MacarronesConTomate{" + "tomate=" + tomate + '}';
    }
    
    @Override
    public String preparacion() {//metodoAbstractoA
        return super.preparacion()+"y añadimos la salsa de tomate";
    }
}
