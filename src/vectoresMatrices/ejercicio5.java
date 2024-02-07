
package vectoresMatrices;

import java.util.Scanner;
import java.util.Arrays;
/*Define un procedimiento que reciba un vector de enteros y devuelva ese mismo vector ordenado de menor a mayor*/

public class ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int longitud=0;
        int num=0;
        System.out.println("Introduce la longitud para el vector");
        longitud = sc.nextInt();
        
        int vector[] = new int[longitud];
        
        for (int i = 0; i < longitud; i++) {
            System.out.println("Introduce elementos del vector");
            vector[i]= sc.nextInt();
        }
        
        order(vector,longitud);
        System.out.println("Vector ordenado de menor a mayor: " + Arrays.toString(vector));
    
    }
    
    public static void order(int vector[], int longitud){
        Arrays.sort(vector);
       
        
    }
}
