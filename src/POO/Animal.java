package POO;

public class Animal {
        // String nombre;
        // int edad;

        // public Animal(String nombre,int edad){
        //     this.nombre = nombre;
        //     this.edad = edad;
        // }

        // public String hacerSonido(){
        //     return "Grrr";
        // }

        ///////////////////////SESSION CLASS STATIC ////////////////////
        //////////////////////                    ///////////////////


        String nombre;
        int edad;
        static int contadorAnimales = 0;

        public Animal(String nombre,int edad){
            this.nombre = nombre;
            this.edad = edad;
            contadorAnimales++;
        }

        public String hacerSonido(){
            return "Grrrr";
        }

        public static int getCantAnimales(){
            return contadorAnimales;
        }
    
}
