
import java.util.Scanner;
/**
 * Saber la cantidad de numeros de un digito.
 * @author Lenovo
 */
public class EjercicioJava4 {
    
    int valor;
    
    public static void main(String[] args) {
        EjercicioJava4 ejercicio1 = new EjercicioJava4();
        
        
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero por favor: ");
        ejercicio1.valor = numero.nextInt();
        
        System.out.println("El numero tiene " + Integer.toString(ejercicio1.valor).length() + " digitos");
    }
}
