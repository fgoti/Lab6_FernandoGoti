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
public class Canchas extends Lugar{
    private String Categoria_canchas;
    private String Estado;

    public Canchas() {
        super();
    }

    public Canchas(String Categoria_canchas, String Estado, String Nombre, String Direccion, int Nivel_Seguridad, Carretera carretera_entrada, Carretera carretera_salida) {
        super(Nombre, Direccion, Nivel_Seguridad, carretera_entrada, carretera_salida);
        this.Categoria_canchas = Categoria_canchas;
        this.Estado = Estado;
    }

    public String getCategoria_canchas() {
        return Categoria_canchas;
    }

    public void setCategoria_canchas(String Categoria_canchas) {
        this.Categoria_canchas = Categoria_canchas;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
return super.getNombre();    }
    
    
}
