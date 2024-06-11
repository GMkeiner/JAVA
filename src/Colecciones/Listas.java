package Colecciones;


// import java.util.ArrayList;
// import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class Listas {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidos a la fiesta de los superheroes");

       // ArrayList
       // las listas se pueden  duplicar y por defecto ya vienen ordanadas.
       // Podemos ingresar por indices.

        // List<String> superHeroes = new ArrayList<>();

        // LinkedList
        // Este como esta doble enlazado permite que la modificacion sea mas rapida y eficiente funciona igual.
        // List<String> superHeroes = new LinkedList<>();

        // Vector
        // si hicieramos multi hilo o modificaciones en la mis conleccion estaria sincronizado y sria igual.
        List<String> superHeroes = new Vector<>();

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

        System.out.println("Hay un super heroe que ya esta ebrio, el super heroe es: " + superHeroes.get(0));

        superHeroes.set(6, "Toni Stark"); // Intercambiar Iron man por Toni Stark.
        System.out.println("Iron man se saca el traje mostrando su verdadera identidad que es: " + superHeroes.get(6));

        superHeroes.remove(3);

        if(!superHeroes.contains("Hulk")){
            System.out.println("Hulk se ha ido de la fiesta");
        }

        // Fue y volvio tan rapido al kiosko (tienda) que no nos dimos cuenta que se fue

        // superHeroes.add("Superman"); 
        // superHeroes.add("Superman"); // si se agrega porque en los List es pueden  duplicarse.
        // superHeroes.add("Superman"); 


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
