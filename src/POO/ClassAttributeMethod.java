///////////////////////SESSION CLASS ATTRIBUTE Y METHOD  ////////////////////
//////////////////////                    ///////////////////
package POO;

public class ClassAttributeMethod {
    public static void main(String[] args) throws Exception{
        
        // Persona persona_1 = new Persona();
        // persona_1.nombre = "Keiner";
        // persona_1.apellido = "Muñoz";
        // persona_1.edad = 18;
        // persona_1.carrera.nombre = "Futbolista";

        // Carrera carrera1 = new Carrera();
        // carrera1.nombre = "Futbolista";
        // carrera1.duracion = 6;
        // carrera1.estaCurso = false;
        
        // persona_1.carrera = carrera1;

        // Persona persona_2 = new Persona();
        // persona_2.nombre = "Jose";
        // persona_2.apellido = "Perez";
        // persona_2.edad = 23;

        // Carrera carrera2 = new Carrera();
        // carrera2.nombre = "Ingenieria de sistemas";
        // carrera2.duracion = 6;
        // carrera2.estaCurso = true;

        // persona_2.carrera = carrera2;

        // String saludado = "Keiner Muñoz";

        // System.out.println(persona_1.apellido + ", " + persona_1.nombre + " tiene " + persona_1.edad + " años.");
        // System.out.println(persona_2.apellido + ", " + persona_2.nombre + " tiene " + persona_2.edad + " años.");

        // System.out.println(persona_1.darNombreCompleto() + " tiene " + persona_1.edad + " años y es " + persona_1.carrera.nombre);
        // System.out.println(persona_2.darNombreCompleto() + " tiene " + persona_2.edad + " años y esta cursando " + persona_2.carrera.nombre);
        // System.out.println(persona_1.enviarSaludo(saludado)); // forma #1
        // System.out.println(persona_2.enviarSaludo("Jose Perez")); // forma #2 

        ///////////////////////SESSION CLASS ATTRIBUTE Y METHOD  ////////////////////
        //////////////////////      PARTE 2              ///////////////////

        Persona persona_1 = new Persona();
        persona_1.nombre = "Keiner";
        persona_1.apellido = "Muñoz";
        persona_1.edad = 18;
        persona_1.carrera.nombre = "Futbolista";

        System.out.println(persona_1.darNombreCompleto() + " tiene " + persona_1.edad + " años y es " + persona_1.carrera.nombre);
    }
}
