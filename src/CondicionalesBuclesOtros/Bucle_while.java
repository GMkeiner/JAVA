package CondicionalesBuclesOtros;
///////////////////////SESSION BUCLE_WHILE///////////////////
//////////////////////                    ///////////////////



public class Bucle_while {
    public static void main(String[] args) throws Exception{
        int contador = 1; 

        while (contador <= 5) {
            System.out.println(contador); // si lo dejamos asi como esta sera un bucle infinito para ello necesitamos actualizar la variable contadora

            // Actualizacion de la variable

            contador++; // para que no sea un bucle infinito
        }
        System.out.println(contador); // muestro el numero 6 que seria la iteracion que no muestra el while
    }
}
