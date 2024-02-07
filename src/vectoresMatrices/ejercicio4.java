

package vectoresMatrices;

import java.util.Scanner;

/*
Define 2 funciones que calculen la cantidad de numero pares e impares, respectivamente, que hay en un vector de enteros
*/
public class ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int longitud=0;
        int num;
       
        
        System.out.println("Introduce la longitud del vector");
        longitud = sc.nextInt();
        int vector[] = new int[longitud];
        
        for (int i = 0; i < longitud; i++) {
            System.out.println("Introduce un numero " + i + " : ");
            vector[i] = sc.nextInt();           
        }
        
        par( vector,  longitud);
        impar( vector,  longitud);
    }
    
    
    public static void par(int vector[], int longitud){
        
        int par =0;
        
        for (int i = 0; i < longitud; i++) {
            if(vector[i] % 2 ==0){
                par = par + 1;
            }   
        }
        System.out.println("Hay "+ par + " números pares");    
    }
    
    public static void impar(int vector[], int longitud){
        
        int impar =0;
        
        for (int i = 0; i < longitud; i++) {
            if(vector[i] % 2 !=0){
                impar = impar + 1;
            }   
        }
        System.out.println("Hay "+ impar + " números impares");    
    }
}
