///////////////////////SESSION IF ELSE Y ELSE IF////////////////////
//////////////////////                    ///////////////////

public class If_else {
    public static void main(String[] args) throws Exception{
        String nombre = "Keiner";
        int edad = 18;

        if(edad > 18 && edad <= 60){
            System.out.println("Puedes entrar a la fiesta Sr: "+ nombre);
        } else if (edad > 60 ){
            System.out.println("No puedes entrar ya que no es para mayores de 60 años Sr: "+ nombre);    
        } else if (edad == 18 ){
            System.out.println("Tienes la edad justa para entrar Sr: "+ nombre);
        }else{
            System.out.println("No tienes la edad para poder entrar Sr: "+ nombre);
        }
    }
}

