
/**
 * Averiguar el promedio de un arreglo.
 * @author Lenovo
 */
public class EjercicioJava5 {
    public static void main(String[] args) {
        int[] arreglo = new int[9];
        arreglo[0] = 10;
        arreglo[1] = 20;
        arreglo[2] = 30;
        arreglo[3] = 40;
        arreglo[4] = 50;
        arreglo[5] = 45;
        arreglo[6] = 99;
        arreglo[7] = 35;
        arreglo[8] = 67;        

      int suma = 0;  
      for (int i = 0; i < arreglo.length; i++){
            suma += arreglo[i];
         }
      int promedio = suma / 9;
        
         System.out.println("El promedio de los arreglos es: " + promedio);
    }
}
