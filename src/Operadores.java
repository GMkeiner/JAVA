///////////////////////SESSION OPERADORES////////////////////
//////////////////////                    ///////////////////



public class Operadores {
    public static void main(String[] args) throws Exception{
        
        // OPERADORES: Simbolos que sirven pra hacer operaciones con variables o valores
        //ARITMETICOS:
        // Aqui se puede utilizar el int o el double 

        // int numero_1 = 5;
        // int numero_2 = 4;

        // int Suma = numero_1 + numero_2;
        // System.out.println("La suma es: " + Suma);

        // int Resta = numero_1 - numero_2;
        // System.out.println("La resta es: " + Resta);

        // int Multiplicacion = numero_1 * numero_2;
        // System.out.println("La multiplicacion es: " + Multiplicacion);

        // int Division = numero_1 / numero_2;
        // System.out.println("La division es: " + Division);

        // int a = 13;
        // int b  = a % 2; // El resto nos puede servir para identificar si un numero es par o impar

        // // ASIGNACION

        // int c = 5;
        // c=10;
        // c+= 15;
        // c+=25;
        // c-= 15;
        // c*= 2;
        // c/=10;
        // c++;
        // c++;
        // c--;
        // c--;
        // System.out.println(b);
        // System.out.println(c);

        // OPERADORES DE COMPARACION

        // int a = 3;
        // int b = 4;

        // boolean esMayor = a > b;
        // boolean esMenor = a < b;
        // boolean esIgual = a == b;

        // System.out.println(esMayor);
        // System.out.println(esMenor);
        // System.out.println(esIgual);

        //OPERADORES DE LOGICA

        boolean condicion1 = true;
        boolean condicion2 = false;

        boolean resultadoAND = condicion1 && condicion2; // Ambos deben ser positivos para que de true
        boolean resultadoOR = condicion1 || condicion2; // uno de los dos debe ser positivo para de true
        boolean resultadoNOT = !condicion1; // Es lo opuesto a lo que tenga asignado previamente

        /*
         * TABLA DE LA VERDAD
         * AND          OR            NOT
         * 
         *   | V | F     | V | F         NOT
         * V | V | F   V | V | V      V | !F
         * F | F | F   F | V | F      F | !V 
         * 
         */

        System.out.println(resultadoAND); 
        System.out.println(resultadoOR); 
        System.out.println(resultadoNOT); 

    }
}
