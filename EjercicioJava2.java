import java.util.Scanner;
/**
 *Verificar si un número es positivo, negativo o cero.
 * @author Lenovo
 */
public class EjercicioJava2 {
    public static void main(String[] args) {
        int Num1;
        
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero por favor: ");
        Num1 = numero.nextInt();
        
        if (Num1 < 0){
            System.out.println("Tu numero es negativo");
            } else if (Num1 > 0){
                System.out.println("Tu numero es positivo");
            } else {
                System.out.println("Tu numero es cero");
            }
        
    }
}

