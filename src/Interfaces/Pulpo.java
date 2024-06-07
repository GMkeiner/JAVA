package Interfaces;

import Interfaces.interfaces.Alimentable;
import Interfaces.interfaces.Comunicable;

public class Pulpo extends CriaturasMarinas implements Comunicable, Alimentable{

    int cantTentaculos;

    public Pulpo(String nombre , int cantTentaculos){
        super(nombre);
        this.cantTentaculos = cantTentaculos;
    }


    @Override
    void nadar() {
        System.out.println(nombre + " esta nadando con sus " + cantTentaculos + " tentaculos");
    }


    @Override
    public void Comunicarse() {
      System.out.println(nombre + " saluda con sus" + cantTentaculos + " tentaculos");
    }


    @Override
    public void alimentar() {
        System.out.println("Estamos alimentando con peces a " + nombre);
    }

    


}