///////////////////////SESSION VARIABLES////////////////////
//////////////////////                    ///////////////////


public class Variables {
    public static void main(String[] args) throws Exception{
        

        /*
         * VARIABLE 
         *  Es un espacio en memoria que tiene un nombre asociado y puede contener un valor cambiante
         * DECLARACION
         *  Asignar el tipo de dato y el nombre de la variable sin darle un valor inicial
         * DEFINICION
         *  Asignar el tipo de dato y el nombre de la variable dandole o no un valor inicial
         * ASIGNACION
         *  Darle un valor a la variable ya declarada
         */

         /*
          * TIPOS DE VARIABLES
          Variables primitivas : Almacenan valores basicos
          Variables de referencia : Almacena direcciones de memoria que apuntan a objetos
          */

          // TIPO DE DATO ENTEROS : byte(-128 al 127) , short(-32768 al 32767), int, long
          int numero = 5;
          // TIPO DE DATOS REALES : float (6 decimales y colocar una f al final para que funciones) y el double
          double decimales = 5.01234567898889;
          float decimalesFloat = 5.01234567898887887987789f;

          // TIPO DE DATO DE CARACTER

          char letra = 's';

          // TIPO DE DATO BOOLEANO

          boolean verdadero = true;
          boolean falso = false;

          String cadena = "Estoy aprendiendo JAVA desde youtube"; // cadena de texto simple

          System.out.println(numero); // Este para enteros, tambien se puede los antes mostrados
          System.err.println(decimales); // Este para el double
          System.out.println(decimalesFloat); // Este es para el float
          System.out.println(letra); // Este para caracteres y debe estar en comillas simples con las dobles no funciona
          System.out.println(verdadero); // Tipo de dato booleano true
          System.out.println(falso); // Tipo de dato booleano false
          System.out.println(cadena); // Para cadenas de texto
    }
}
