package Mapas;

import java.util.LinkedHashMap;
//import java.util.HashMap;
import java.util.Map;
// import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("Bienvenidos a nuestra verdureria (tienda de frutas y verduras)");

        // Map<String, Double> inventario = new HashMap<>(); // No respeta el orden de la coleccion.
        // Map<String, Double> inventario = new TreeMap<>(); // ordena por orden alfabetico.
        Map<String, Double> inventario = new LinkedHashMap<>(); // Mantiene el orden como estaba.

        inventario.put("Banana", 0.89);
        inventario.put("Tomate", 0.75);
        inventario.put("Palta", 0.95);
        inventario.put("Frutilla", 0.65);
        inventario.put("Pimiento", 0.77);

        System.out.println("Este es el inventario de frutas y verduras: ");

        // keySet me da un arreglo con las keys
        for ( String fruta : inventario.keySet()){
                                        // con el get puedo acceder al valor
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }

        String frutaBuscada = "Banana";
        System.out.println("Se acerca un cliente y nos pide la sgte fruta: " + frutaBuscada);

        if(inventario.containsKey(frutaBuscada)){
            System.out.println(frutaBuscada + " esta en el inventario, encantados la vendemos");
        } else {
            System.out.println("Lamentablemente nos quedamos sin: "+ frutaBuscada);
        }

        String sinStock = "Banana";

        inventario.remove(sinStock);

        System.out.println("Nos hemos quedado sin: "+ sinStock);

        for ( String fruta : inventario.keySet()){
            // con el get puedo acceder al valor
        System.out.println(fruta + ": $" + inventario.get(fruta));
        }

        System.out.println("la cantidad de mercaderia es: " + inventario.size());
    }
}
