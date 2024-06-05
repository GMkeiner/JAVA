///////////////////////SESSION CLASS ATTRIBUTE Y METHOD  ////////////////////
//////////////////////                    ///////////////////

package POO;

public class Carrera {
    String nombre;
    int duracion;
    boolean estaCursando;

    public Carrera(String nombre, int duracion, boolean estaCursando){
        this.nombre = nombre;
        this.duracion = duracion;
        this.estaCursando = estaCursando;
    }

    public Carrera(String nombre){
        this.nombre = nombre;
    }
}
