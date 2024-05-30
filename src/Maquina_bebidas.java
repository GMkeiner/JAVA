///////////////////////SESSION SCANNER Y PRACTICA #1 MAQUINA DE BEBIDAS////////////////////
//////////////////////                    ///////////////////

import java.util.Scanner;

public class Maquina_bebidas {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String nombreCliente = "Luis";
        System.out.println("Bienvenido a la maquina de bebidas");
        System.out.println("1 - Cafe");
        System.out.println("2 - Jugo");
        System.out.println("3 - Ron");
        System.out.println("4 - Gaseosa");
        
        int opcion = scanner.nextInt();
    
        switch (opcion) {
            case 1:
            System.out.println("Buena eleccion, de paso combina con el pan Sr: " +nombreCliente);
                break;
            case 2:
            System.out.println("Debes ser colombiano por que te gusta el jugo Sr: "+nombreCliente);
                break;
            case 3:
            System.out.println("Si tomastes ron no manejes para evitar accidentes Sr: "+nombreCliente);
                break;    
            case 4:
            System.out.println("Ten en cuenta el azucar ya que es malo para la salud Sr: "+nombreCliente);
                break;
            default:
            System.out.println("Opcion no valida Sr: "+nombreCliente);
                break;
        }

        if(opcion <= 4){
            System.out.println("¡Disfrute de su bebida!");
        }
        scanner.close();
    }
}

