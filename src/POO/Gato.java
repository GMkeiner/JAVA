package POO;

// Con esto especificamos que gato hereda de animal
public class Gato extends Animal{

    // Con la palabra super estamos asignando la informacion heredada
    public Gato(String nombre , int edad){
        super(nombre , edad);
    }

    @Override
    public String hacerSonido(){
        return "Miau";
    }
}
