///////////////////////SESSION CLASS ATTRIBUTE Y METHOD  ////////////////////
//////////////////////                    ///////////////////



package POO;

public class Persona {
    
    // Atributos (estado/caracteristicas de un objeto)
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;

    // Contructor 

    public Persona(){
        carrera = new Carrera();
    }


    // Metodos (Comportamientos de un objeto)
    public String darNombreCompleto(){
        return apellido + ", " + nombre;
    }

    public String enviarSaludo(String saludado){
        if(edad  > 40) return "Buenos Dias, querido " + saludado;
        return "Hola, Como Estas? " + saludado + "?";
    }
}
