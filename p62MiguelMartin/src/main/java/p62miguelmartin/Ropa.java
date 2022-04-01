/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62miguelmartin;

import java.util.Objects;

/**
 *
 * @author miguel
 */
public abstract class Ropa extends Producto implements SeEnvia{
    protected String marca;

    public Ropa() {
    }

    public Ropa(String marca) {
        this.marca = marca;
    }

    public Ropa(String marca, String codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Ropa{" + "marca=" + marca +"\n"+super.toString()+ '}';
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("La ropa de marca "+this.marca+" con precio "
                +this.precio+" y codigo"+this.codigo+" se enviará a la direccion "+direccion);
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Ropa other = (Ropa) obj;
        return Objects.equals(this.marca, other.marca);
    }
    
}
