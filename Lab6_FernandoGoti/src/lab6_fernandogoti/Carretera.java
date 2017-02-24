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
    private String Carretera_inicio;
    private String Carretera_final;

    public Carretera() {
    }

    public Carretera(int codigo, int kilometros, String carretera_inicio, String carretera_final) {
        this.Codigo = codigo;
        this.Distancia = kilometros;
        this.Carretera_inicio = carretera_inicio;
        this.Carretera_final = carretera_final;
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

    public String getCarretera_inicio() {
        return Carretera_inicio;
    }

    public void setCarretera_inicio(String carretera_inicio) {
        this.Carretera_inicio = carretera_inicio;
    }

    public String getCarretera_final() {
        return Carretera_final;
    }

    public void setCarretera_final(String carretera_final) {
        this.Carretera_final = carretera_final;
    }

    @Override
    public String toString() {
        return Integer.toString(Codigo);
    }
}
