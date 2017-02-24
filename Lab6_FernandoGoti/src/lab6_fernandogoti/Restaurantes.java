
package lab6_fernandogoti;

/**
 *
 * @author Fernando Goti
 */
public class Restaurantes extends Lugar {

    private String Categoria_restaurantes;
    private int Calificacion;

    public Restaurantes() {
        super();
    }

    public Restaurantes(String Categoria, int Calificacion, String Nombre, String Direccion, int Nivel_Seguridad, Carretera carretera_entrada, Carretera carretera_salida) {
        super(Nombre, Direccion, Nivel_Seguridad, carretera_entrada, carretera_salida);
        this.Categoria_restaurantes = Categoria;
        this.Calificacion = Calificacion;
    }

    public String getCategoria() {
        return Categoria_restaurantes;
    }

    public void setCategoria(String Categoria) {
        this.Categoria_restaurantes = Categoria;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }

    @Override
    public String toString() {
        return super.toString()+"Restaurantes{" + "Categoria=" + Categoria_restaurantes + ", Calificacion=" + Calificacion + '}';
    }
}
