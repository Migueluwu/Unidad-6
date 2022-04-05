<<<<<<< Updated upstream
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62miguelmartin;

/**
 *
 * @author miguel
 */
public final class LibroDigital extends Libro implements SeDescarga{
    private int numkBytes;

    public LibroDigital() {
    }

    public LibroDigital(int numkBytes) {
        this.numkBytes = numkBytes;
    }

    public LibroDigital(int numkBytes, String isbn) {
        super(isbn);
        this.numkBytes = numkBytes;
    }

    public LibroDigital(int numkBytes, String isbn, String codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numkBytes = numkBytes;
    }


    public int getNumkBytes() {
        return numkBytes;
    }

    public void setNumkBytes(int numkBytes) {
        this.numkBytes = numkBytes;
    }

    @Override
    public String toString() {
        return "LibroDigital{" + "numkBytes=" + numkBytes +"\n"+super.toString()+ '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.numkBytes;
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
        final LibroDigital other = (LibroDigital) obj;
        return true;
    }

    @Override
    public void descargar() {
        System.out.println("http://tunombre.daw/"+this.hashCode());
    }

    @Override
    public void leerLibro() {
        System.out.println("Empiezo a leerlo y se acaba la bateria");
    }
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62miguelmartin;

/**
 *
 * @author miguel
 */
public final class LibroDigital extends Libro implements SeDescarga{
    private int numkBytes;

    public LibroDigital() {
    }

    public LibroDigital(int numkBytes) {
        this.numkBytes = numkBytes;
    }

    public LibroDigital(int numkBytes, String isbn) {
        super(isbn);
        this.numkBytes = numkBytes;
    }

    public LibroDigital(int numkBytes, String isbn, String codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numkBytes = numkBytes;
    }


    public int getNumkBytes() {
        return numkBytes;
    }

    public void setNumkBytes(int numkBytes) {
        this.numkBytes = numkBytes;
    }

    @Override
    public String toString() {
        return "LibroDigital{" + "numkBytes=" + numkBytes +"\n"+super.toString()+ '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.numkBytes;
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
        final LibroDigital other = (LibroDigital) obj;
        return true;
    }

    @Override
    public void descargar() {
        System.out.println("http://tunombre.daw/"+this.hashCode());
    }

    @Override
    public void leerLibro() {
        System.out.println("Empiezo a leerlo y se acaba la bateria");
    }
    
}
>>>>>>> Stashed changes
