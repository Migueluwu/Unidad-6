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
public class CampanaExtractora extends Electrodomestico {

    private int decibelios;

    public CampanaExtractora(int decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        if (decibelios >= 50) {
            this.decibelios = decibelios;
        }
    }

    public int getDecibelios() {

        return decibelios;
    }

    public void setDecibelios(int decibelios) {
        if (decibelios >= 50) {
            this.decibelios = decibelios;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"CampanaExtractora{" + "decibelios=" + decibelios + '}';
    }
}
