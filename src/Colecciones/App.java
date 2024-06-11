package Colecciones;

import java.util.LinkedHashSet;
// import java.util.HashSet;
import java.util.Set;
// import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("Bienvenidos a la fiesta de los superheroes");

        // HashSet 
        // Set<String> superHeroes = new HashSet<>(); // No acepta duplicados y ademas no guarda el orden lo muestra desordenados.

        // TreeSet
        // Set<String> superHeroes = new TreeSet<>(); // Ordena los objetos en forma alfabetica.

        // LinkedHashSet
        Set<String> superHeroes = new LinkedHashSet<>(); // Hace un doble link para poder mantener el orden en que se agregaron por eso lo muestra de forma ordenada.
    
        // se crea la coleccion de superheroes 
        superHeroes.add("Spiderman");
        superHeroes.add("Batman");
        superHeroes.add("CatWoman");
        superHeroes.add("Hulk");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Superman");

        // Despues llego tarde nuestro superheroe estrella

        superHeroes.add("Iron Man");

        // Spiderman se fue de la fiesta
        if(superHeroes.contains("Spiderman")){
            System.out.println("Spiderman esta en la fiesta");
        }

        superHeroes.remove("Hulk");

        if(!superHeroes.contains("Hulk")){
            System.out.println("Hulk se ha ido de la fiesta");
        }

        // Fue y volvio tan rapido al kiosko (tienda) que no nos dimos cuenta que se fue

        superHeroes.add("Superman"); 

        if(superHeroes.isEmpty()){
            System.out.println("La fiesta ha terminado todos se han ido");
        }else {
            System.out.println("La fiesta continua aun hay " + superHeroes.size() + " superheroes");
        }

        System.out.println("Quienes estan aun en la fiesta?");

        for(String superHeroe : superHeroes){
            System.out.println(superHeroe);
        }
    }
}
