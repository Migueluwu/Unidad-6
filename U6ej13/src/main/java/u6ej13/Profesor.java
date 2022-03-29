/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u6ej13;

/**
 *
 * @author 34616
 */
public class Profesor extends Persona{
    private String especialidad;

    @Override
    public void identificate() {
        System.out.println("Profesor");
    }

    public Profesor() {
    }

    public Profesor(String especialidad) {
        this.especialidad = especialidad;
    }

    public Profesor(String especialidad, String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "especialidad=" + especialidad + '}';
    }
}
