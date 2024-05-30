public class ControlesDeFlujo {
    public static void main(String[] args) throws Exception{
        int i;

        for(i= 1; i<= 10; i++){
            System.out.println(i);
            if(i == 5){
                // break; // Sirve para cortar el bucle directamente
                // continue; // saltea las lineas que continuan del scope
                return;
            }
            System.out.println(i);
        }
    }
}
