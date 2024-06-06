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

        // Persona persona_1 = new Persona();
        // persona_1.nombre = "Keiner";
        // persona_1.apellido = "Muñoz";
        // persona_1.edad = 18;
        // persona_1.carrera.nombre = "Futbolista";

        // System.out.println(persona_1.darNombreCompleto() + " tiene " + persona_1.edad + " años y es " + persona_1.carrera.nombre);


        ///////////////////////SESSION POO  ////////////////////
        //////////////////////      PARTE 1              ///////////////////

        // Persona persona_1 = new Persona("Pedro","Pascal",48,"Mandaloriano", 20,true);

        // System.out.println(persona_1.darNombreCompleto() 
        // + " tiene " + persona_1.edad 
        // + " años y esta recibido " 
        // + persona_1.carrera.nombre);




 ///////////////////////SESSION POO GETTERS Y SETTERS ////////////////////
        //////////////////////      PARTE 2             ///////////////////

        // Persona persona1 = new Persona("Pedro","Pascal",48);

        // persona1.setNombre("Ricardo");
        // persona1.setApellido("Darin");

        // System.out.println(persona1.darNombreCompleto() 
        // + " tiene " + persona1.getEdad() + " años. " );


        ///////////////////////SESSION POO HERENCIA ////////////////////
        //////////////////////      PARTE 1             ///////////////////

        Animal animal = new Animal("Bestia",  200);
        Gato gato = new Gato("Pepe", 15);
        Perro perro = new Perro("firulais", 3);

        System.out.println("El animal llamado " + animal.nombre + "hace:");
        System.out.println(animal.hacerSonido());

        System.out.println("El gato llamado " + gato.nombre + " hace:");
        System.out.println(gato.hacerSonido());

        System.out.println("El perro llamado " + perro.nombre + " hace:");
        System.out.println(perro.hacerSonido());
    }
}
