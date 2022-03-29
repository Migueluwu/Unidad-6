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
public class Direccion {
    private String calle;
    private String ciudad;
    private String cP;
    private String pais;

    public Direccion() {
    }

    public Direccion(String calle, String ciudad, String cP, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.cP = cP;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getcP() {
        return cP;
    }

    public void setcP(String cP) {
        this.cP = cP;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", ciudad=" + ciudad + ", cP=" + cP + ", pais=" + pais + '}';
    }
}
