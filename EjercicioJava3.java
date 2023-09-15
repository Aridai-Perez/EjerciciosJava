import java.util.Scanner;
/**
 * Saber si un numero es par o impar.
 * @author Lenovo
 */
public class EjercicioJava3 {
    public static void main(String[] args) {
        int numeroUnico;
        
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero por favor: ");
        numeroUnico = numero.nextInt();
        
        if (numeroUnico % 2 == 0){
            System.out.println("Tu numero es par");
            } else {
                System.out.println("Tu numero es impar");
            }
      
    }
}
