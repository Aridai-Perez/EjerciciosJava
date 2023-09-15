
import java.util.Scanner;
/**
 * Saber cual de los 3 digitos es el menor
 * @author Lenovo
 */
public class EjercicioJava6 {
    public static void main(String[] args) {
        
        int Num1;
        int Num2;
        int Num3;
        
        Scanner numeros = new Scanner(System.in);
        System.out.println("Ingrese un numero por favor: ");
        Num1 = numeros.nextInt();
        System.out.println("Ingrese un numero por favor: ");
        Num2 = numeros.nextInt();
        System.out.println("Ingrese un numero por favor: ");
        Num3 = numeros.nextInt();
        
        if(Num1 < Num2 && Num1 < Num3){
        System.out.println("El numero menor es " + Num1);
        }else{
            if(Num2 < Num1 && Num2 < Num3){
            System.out.println("El numero menor es " + Num2);
            }
        }
        
        if(Num1 == Num2 && Num1 < Num3){
        System.out.println("El numero menor es " + Num1);
        }else{
            if(Num2 == Num1 && Num2 < Num3){
            System.out.println("El numero menor es " + Num2);
            }else{
            System.out.println("El numero menor es " + Num3);
            }
        }
    }
}
