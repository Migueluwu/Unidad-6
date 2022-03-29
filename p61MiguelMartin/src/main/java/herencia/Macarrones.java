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
public class Macarrones extends Comida{ //Clase B
    protected boolean hervido;
    protected boolean conQueso;
    
    public Macarrones() {
        this.hervido=false;
        this.conQueso=false;
    }

    public Macarrones(boolean hervido, boolean conQueso) {
        this.hervido = hervido;
        this.conQueso = conQueso;
    }

    public Macarrones(boolean hervido, boolean conQueso, String procedencia, LocalDate caducidad) {
        super(procedencia, caducidad);
        this.hervido = hervido;
        this.conQueso = conQueso;
    }

    
    
    public void preparar(){ //metodo que se va a sobreescrbir(MetodoB2)
        this.hervido=true;
    }

    public void anadirQueso(){ //metodo que solo exixte en esta clase (metodoB)
        this.conQueso=true;
    }
    
    @Override
    public String preparacion() {//metodoAbstractoA
        return"Cuando el agua esté hirviendo introducir la pasta y dejar cocer 10 minutos";
    }
    @Override
    public String toString() {
        return super.toString()+"\n "+"Macarrones{" + "hervido=" + hervido + ", conQueso=" + conQueso + '}';
    }

    public boolean isHervido() {
        return hervido;
    }

    public void setHervido(boolean hervido) {
        this.hervido = hervido;
    }

    public boolean isConQueso() {
        return conQueso;
    }

    public void setConQueso(boolean conQueso) {
        this.conQueso = conQueso;
    }
}
