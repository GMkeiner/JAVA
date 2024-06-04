package ArreglosMatrices;
public class Arreglos {
    public static void main(String[] args) throws Exception{
        // ARREGLOS: Estructuras de datos que tienen valores del mismo tipo bajo un mismo nombre
        // Estos valores se distribuyen secuencialmente en la memoria y se puede acceder a ellos mediante un indice
        // LOS ARREGLOS SON TAMBIEN LLAMADOS VECTORES O MATRICES

        // DATO IMPORTANTE: El indice se comienza a contar por cero y no por uno

        // int[] numeros = new int[5];
        // numeros[0] = 1;
        // numeros[1] = 2;
        // numeros[3] = 3;
        // numeros[4] = 4;

        // // System.out.println(numeros[0]);
        // // System.out.println(numeros[1]);
        // // System.out.println(numeros[2]); // aqui va a mostrar un numero cero porque ese indice no existe en el arreglo
        // // System.out.println(numeros[3]);
        // // System.out.println(numeros[4]);

        // System.out.println(numeros.length);

        // PARTE #2

        // int[] numeros = new int[5];

        // numeros[0] = 10;
        // numeros[1] = 20;
        // numeros[2] = 30;
        // numeros[3] = 40;
        // numeros[4] = 50;

        // for (int index = 0; index < numeros.length; index++) {
        //     System.out.println(numeros[index]);


        // //PARTE #3
        // //Tipo nombre     indices
        // //dato            0   1  2  3  4
        // int[] numeros = {10 ,20,30,40,50};
        
        // numeros[2] = 100; // Modificar el valor de un  indice de nuestro arreglo

        // for (int index = 0; index < numeros.length; index++) {
        //     System.out.println(numeros[index]);
            
        // }

        // //PARTE #4
        // //Tipo nombre     indices
        // //dato            0   1  2  3  4
        // int[] numeros = {10 ,20,30,40,50};
        
        // numeros[2] = 100; // Modificar el valor de un  indice de nuestro arreglo.

        // int indice = 0;
        // //ForEach
        // // Un elemento de arreglo
        // for (int numero : numeros) {
        //     System.out.println(numero);
        //     System.out.println(indice);
        //     indice++;
        // }

        // for (int index = 0; index < numeros.length; index++) {
        //     System.out.println(numeros[index]);
        //     System.out.println(index);
            
        // }

        // String palabras = "Esternocleidomastoideo";

        // System.out.println("La palabra " + palabras + " Tiene " + palabras.length() + " Letras ");


        //PARTE #5
        //Tipo nombre     indices
        //dato            0   1  2  3  4
        int[] numeros = {10 ,20,30,40,50};
        // char[] letras = new char[23];

    
    
       
        numeros[2] = 100; // Modificar el valor de un  indice de nuestro arreglo.

        int indice = 0;
        //ForEach
        // Un elemento de arreglo
        for (int numero : numeros) {
            System.out.println(numero);
            System.out.println(indice);
            indice++;
        }

        for (int index = 0; index < numeros.length; index++) {
            System.out.println(numeros[index]);
            System.out.println(index);
            
        }

        System.out.println();
        String palabras = "Esternocleidomastoideo";

        System.out.println("La palabra " + palabras + " Tiene " + palabras.length() + " Letras ");
    }
}
