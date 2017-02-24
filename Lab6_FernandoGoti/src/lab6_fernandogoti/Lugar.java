/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_fernandogoti;

import java.util.ArrayList;

/**
 *
 * @author Fernando Goti
 */
public class Lugar {

    private String Nombre;
    private String Direccion;
    private int Nivel_Seguridad;
    private Carretera carretera_entrada;
    private Carretera carretera_salida;

    public Lugar() {
    }

    public Lugar(String Nombre, String Direccion, int Nivel_Seguridad, Carretera carretera_entrada, Carretera carretera_salida) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Nivel_Seguridad = Nivel_Seguridad;
        this.carretera_entrada = carretera_entrada;
        this.carretera_salida = carretera_salida;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getNivel_Seguridad() {
        return Nivel_Seguridad;
    }

    public void setNivel_Seguridad(int Nivel_Seguridad) {
        this.Nivel_Seguridad = Nivel_Seguridad;
    }

    public Carretera getCarretera_entrada() {
        return carretera_entrada;
    }

    public void setCarretera_entrada(Carretera carretera_entrada) {
        this.carretera_entrada = carretera_entrada;
    }

    public Carretera getCarretera_salida() {
        return carretera_salida;
    }

    public void setCarretera_salida(Carretera carretera_salida) {
        this.carretera_salida = carretera_salida;
    }

    @Override
    public String toString() {
        return Nombre ;
    }
    

    
    
}
