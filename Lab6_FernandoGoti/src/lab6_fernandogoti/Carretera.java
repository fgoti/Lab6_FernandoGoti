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
public class Carretera {
    private int Codigo;
    private int Distancia;
    private Lugar Carretera_inicio;
    private Lugar Carretera_final;

    public Carretera() {
    }

    public Carretera(int Codigo, int Distancia, Lugar Carretera_inicio, Lugar Carretera_final) {
        this.Codigo = Codigo;
        this.Distancia = Distancia;
        this.Carretera_inicio = Carretera_inicio;
        this.Carretera_final = Carretera_final;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }

    public int getKilometros() {
        return Distancia;
    }

    public void setKilometros(int kilometros) {
        this.Distancia = kilometros;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    public Lugar getCarretera_inicio() {
        return Carretera_inicio;
    }

    public void setCarretera_inicio(Lugar Carretera_inicio) {
        this.Carretera_inicio = Carretera_inicio;
    }

    public Lugar getCarretera_final() {
        return Carretera_final;
    }

    public void setCarretera_final(Lugar Carretera_final) {
        this.Carretera_final = Carretera_final;
    }

    @Override
    public String toString() {
        return Integer.toString(Codigo);
    }
}
