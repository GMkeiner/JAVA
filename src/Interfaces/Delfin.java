package Interfaces;

import Interfaces.interfaces.Alimentable;
import Interfaces.interfaces.Comunicable;

public class Delfin extends CriaturasMarinas implements Comunicable, Alimentable{

    public Delfin(String nombre){
        super(nombre);
    }


    @Override
    void nadar(){
        System.out.println(nombre + "esta nadando en velocidad con su cola y saltando sobre el agua");
    }


    @Override
    public void Comunicarse() {
        System.out.println(nombre + " emite sonidos y chasquidos para comunicarse");
    }


    @Override
    public void alimentar() {
        System.out.println("Le dimos de comer varios arenques " + nombre);
    }
}
