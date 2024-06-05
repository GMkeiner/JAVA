///////////////////////SESSION CLASS ATTRIBUTE Y METHOD  ////////////////////
//////////////////////                    ///////////////////



package POO;

public class Persona {
    
    // Atributos (estado/caracteristicas de un objeto)
    // String nombre;
    // String apellido;
    // int edad;
    // Carrera carrera;

    private String nombre;
    private String apellido;
    private int edad;

    // CONSTRUCTOR

    // public Persona(String nombre, String apellido, int edad, String nombreCarrera ){
    //     carrera = new Carrera();
    //     this.nombre = nombre;
    //     this.apellido = apellido;
    //     this.edad = edad;
    //     carrera.nombre = nombreCarrera;
    // }

    // public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracionCarrera, boolean estaCursando ){
    //     carrera = new Carrera(nombreCarrera, duracionCarrera, estaCursando);
    //     this.nombre = nombre;
    //     this.apellido = apellido;
    //     this.edad = edad;
    // }

    // //SOBRE CARGA DEL CONSTRUCTOR
    // public Persona(String nombre, String apellido, int edad, String nombreCarrera ){
    //     carrera = new Carrera(nombreCarrera);
    //     this.nombre = nombre;
    //     this.apellido = apellido;
    //     this.edad = edad;
        
    // }

    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
   


    // Metodos (Comportamientos de un objeto)
    public String darNombreCompleto(){
        return getApellido() + ", " + getNombre();
        // return apellido + ", " + nombre;
    }

   

    public String enviarSaludo(String saludado){
        if(edad  > 40) return "Buenos Dias, querido " + saludado;
        return "Hola, Como Estas? " + saludado + "?";
    }


    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getApellido() {
        return apellido;
    }



    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }
}
