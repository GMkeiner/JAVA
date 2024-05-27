///////////////////////SESSION CADENAS////////////////////
//////////////////////                    ///////////////////



public class Cadenas {
    public static void main(String[] args) throws Exception{
        String texto = "   Este es un texto asignado a una variable String   ";
        System.out.println(texto); // muestra de forma simple la cadena de texto

        int longitud  = texto.length(); // muestra la longitud de la cadena de texto
        System.out.println(longitud);

        char caracter = texto.charAt(8); // muestra la letra de la cadena de texto segun su posicion
        System.out.println(caracter);

        String subcadena = texto.substring(6, 16); // muestra de donde hasta donde sera exportada la cadena de texto
        System.out.println(subcadena);

        String minuscula = texto.toLowerCase(); // muestra la cadena de texto todo en minuscula
        System.out.println(minuscula);

        String mayucula = texto.toUpperCase(); // muestra la cadena de texto todo en mayuscula
        System.out.println(mayucula);

        int indice = texto.indexOf("variable"); // muestra el indice de lo que le estamos pasando
        System.out.println(indice);

        String reemplazo = texto.replace("texto", "parrafo"); // muestra el proceso de reemplazo en la cadena de texto
        System.out.println(reemplazo);

        boolean contiene = texto.contains("asignado"); // muestra un true o un false si contiene o no contiene esa palabra en la cadena de texto 
        System.out.println("¿Tiene la palabra asignado: " + contiene);

        String sinEspacios = texto.trim(); // Elimina los espacios en blanco en ambos estremos del String
        System.out.println(sinEspacios);
    }
}
