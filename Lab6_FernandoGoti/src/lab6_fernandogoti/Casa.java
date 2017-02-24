/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_fernandogoti;

/**
 *
 * @author Fernando Goti
 */
public class Casa extends Lugar {

    public Casa() {
        super();
    }

    public Casa(String Nombre, String Direccion, int Nivel_Seguridad, Carretera carretera_entrada, Carretera carretera_salida) {
        super(Nombre, Direccion, Nivel_Seguridad, carretera_entrada, carretera_salida);
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
}
