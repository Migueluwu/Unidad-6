/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author miguel
 */
public abstract class Comida {
    protected String procedencia;
    protected LocalDate caducidad;

    public Comida() {
    }

    public Comida(String procedencia, LocalDate caducidad) {
        this.procedencia = procedencia;
        this.caducidad = caducidad;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return "Comida{" + "procedencia=" + procedencia + ", caducidad=" + caducidad + '}';
    }

    public abstract String preparacion(); //metodoAbstractoA

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Comida other = (Comida) obj;
        if (!Objects.equals(this.procedencia, other.procedencia)) {
            return false;
        }
        return Objects.equals(this.caducidad, other.caducidad);
    }
   
}
