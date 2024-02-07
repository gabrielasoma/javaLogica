
package vectoresMatrices;

//Define una función que calcule el valor medio de un vector númerico.
//La cantidad de elementos del vector puede variar

import java.util.Scanner;


public class ejercicio2 {
    
    public static void main(String[] args) {
        int n =0;
        int num =0;
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una cantidad para el vector");
        n= sc.nextInt();
        int vector[] =new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce el elemento " +(i+1)+ " : " );
            vector[i] = sc.nextInt();
                  
        }
        System.out.println("Valor medio: "+media(vector,n));      
    }
    
   public static double media(int[] vector, int n) {
        int suma = 0;
        n= vector.length;
        
        for (int i = 0; i < n; i++) {
            suma = suma + vector[i];
        }
        
        double media = (double) suma / n;
        return media;
    }
}


