package ClaseAbstracta;

public abstract class Figura {

    // Este comportamiento sera obligatorio en las clases que hereden de Figura
    abstract double calcularArea();

    void imprimirInformacion(){
        System.out.println("Esta informacion viene desde la clase abstracta");
    }

}
