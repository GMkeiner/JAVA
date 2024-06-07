package Interfaces;

public class App {
    public static void main(String[] args) throws Exception{
        Delfin delfin = new Delfin("Adolfina ");
        Pulpo pulpo = new Pulpo("pigmeo", 8);

        delfin.nadar();
        delfin.Comunicarse();
        delfin.alimentar();

        pulpo.nadar();
        pulpo.Comunicarse();
        pulpo.alimentar();
    }
}
