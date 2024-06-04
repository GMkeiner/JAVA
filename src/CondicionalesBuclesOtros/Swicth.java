package CondicionalesBuclesOtros;
///////////////////////SESSION SWICTH////////////////////
//////////////////////                    ///////////////////



public class Swicth {
    public static void main(String[] args) throws Exception{
       // EJERCISIO EXPENDEDOR DE BEBIDAS 
       //¿Que bebida te gusta?
       
       // FORMA #1 CON EL IF ELSE Y ELSE IF 

       String bebida = "Gaseosa";

    //    if(bebida == "Cafe"){
    //     System.out.println("Buena eleccion, de paso combina con el pan");
    //    }else if (bebida == "Jugo"){
    //     System.out.println("Debes ser colombiano por que te gusta el jugo");
    //    }else if (bebida == "Ron"){
    //     System.out.println("Si tomastes ron no manejes para evitar accidentes");
    //    }else if (bebida == "Gaseosa"){
    //     System.out.println("Ten en cuenta el azucar ya que es malo para la salud");
    //    }else {
    //     System.out.println("Disfrute su bebida");
    //    }

       // FORMA #2 CON SWICTH

       switch (bebida) {
        case "Cafe":
        System.out.println("Buena eleccion, de paso combina con el pan");
            break;
        case "Jugo":
        System.out.println("Debes ser colombiano por que te gusta el jugo");
            break;
        case "Ron":
        System.out.println("Si tomastes ron no manejes para evitar accidentes");
            break;    
        case "Gaseosa":
        System.out.println("Ten en cuenta el azucar ya que es malo para la salud");
            break;
        default:
        System.out.println("Disfrute su bebida");
            break;
       }
    }
}
