import java.util.Scanner;
/**
 *Obtener el area de un circulo.
 * @author Lenovo
 */
public class EjercicioJava1 {
    
    public static void main(String[] args) {
        int radioCirculo;
        
        Scanner medidaCirculo = new Scanner(System.in);
        System.out.println("Ingresa el radio de tu circulo: ");
        radioCirculo = medidaCirculo.nextInt();
        
        double resultado = (radioCirculo * radioCirculo) * Math.PI ;
        
        System.out.println("El area de tu circulo es " + resultado);

    }     
            
}