package Excepciones;

public class App {
    public static void main(String[] args) throws Exception{
        // Excepciones: eventos que interrumpen el flujo normal de la aplicacion
        // Unchecked y checked

        // int numero1 = 5;
        // int numero2 = 0;
        // int resultado;

        // double numero1 = 5;
        // double numero2 = 0;
        // double resultado;

        // double numero1 = 10;
        // int numero2 = 5;
        // int resultado;

        // System.out.println(numero1 / numero2);
        // System.out.println("Esto va despues del error"); // Esto no se muestra porque el error hace que se corte el flujo del codigo osea cuando sale error corta el fujo normal y por eso no lo muestra el System.

        // try {
        //     resultado = numero1 / numero2;
        //     System.out.println(resultado);    
        // } catch (Exception e) {

        //     // java.lang.ArithmeticException: / by zero
        //          //  at Excepciones.App.main(App.java:16)

        //     // Esto si se imprime    
        //     e.printStackTrace();
        //     System.out.println("Esto va despues de la Excepcion");
        // }
        // try {
        //     resultado = (int)numero1 / numero2;
        //     System.out.println(resultado);    
        // } catch (Exception e) {

        //     // java.lang.ArithmeticException: / by zero
        //          //  at Excepciones.App.main(App.java:16)

        //     // Esto si se imprime    
        //     e.printStackTrace();
        //     System.out.println("Esto va despues de la Excepcion");   
        // }

        ///////////////////////SESSION EXCEPCIONES  ////////////////////
        //////////////////////       PARTE 2             ///////////////////

        int numero1 = 10;
        int numero2 = 0;
        int resultado;

        Calculadora calculadora = new Calculadora();

        try {
            resultado = calculadora.dividir(numero1, numero2);
            System.out.println(resultado);
        } catch (CalculadoraException e) {
            e.printStackTrace();
        }finally{
           System.out.println("Hemos finalizado el calculo ya sea exitoso o no"); 
        }
    }
}
