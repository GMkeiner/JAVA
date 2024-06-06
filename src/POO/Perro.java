package POO;

public class Perro extends Animal{
    
    // Con la palabra super estamos asignando la informacion heredada
    public Perro(String nombre , int edad){
        super(nombre , edad);
    }

    //con el decorador override podemos sobreescribir un metodo
    @Override
    public String hacerSonido(){
        return "Guau";
    }
}
