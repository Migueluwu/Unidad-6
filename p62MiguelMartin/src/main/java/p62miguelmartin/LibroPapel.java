/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62miguelmartin;

/**
 *
 * @author miguel
 */
public final class LibroPapel extends Libro implements SeEnvia{
    private int numPag;

    public LibroPapel() {
    }

    public LibroPapel(int numPag) {
        this.numPag = numPag;
    }

    public LibroPapel(int numPag, String isbn) {
        super(isbn);
        this.numPag = numPag;
    }

    public LibroPapel(int numPag, String isbn, String codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numPag = numPag;
    }

   

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "LibroPapel{" + "numPag=" + numPag + "\n"+super.toString()+'}';
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("El libro con isbn "+this.isbn+" Se enviará a la direccion "+direccion);
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final LibroPapel other = (LibroPapel) obj;
        return this.numPag == other.numPag;
    }
    
}
