
package vectoresMatrices;

import java.util.Scanner;

public class ejercicio11 {

    /*
    Escribe un programa que calcule la suma de dos matrices. Para realizar la suma, las dimensiones de ambas matrices deben ser las mismas
    Suma de matrices:
    
    A = ( 643
          478
          201
        )
    B = ( 401
          359
          522
        )  
    
    A + B = 
        ( 10 4  4
          7  12 17
          7  2  3        
        )   
    
    */
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numFilA=0, numColA =0;
        int numFilB =0, numColB =0;
       
        
        System.out.println("Introduce la longitud para la fila de la matriz A ");
        numFilA = sc.nextInt();
        System.out.println("Introduce la longitud para la columna de la matriz A");
        numColA = sc.nextInt();
        
        System.out.println("Introduce la longitud para la fila de la matriz B ");
        numFilB = sc.nextInt();
        System.out.println("Introduce la longitud para la columna de la matriz B");
        numColB = sc.nextInt();
        
        while((numFilA != numFilB) || (numColA != numColB)){
            System.out.println("Error, las dimensiones deben de ser iguales");
            System.out.println("Introduce la longitud para la fila de la matriz A ");
            numFilA = sc.nextInt();
            System.out.println("Introduce la longitud para la columna de la matriz A");
            numColA = sc.nextInt();

            System.out.println("Introduce la longitud para la fila de la matriz B ");
            numFilB = sc.nextInt();
            System.out.println("Introduce la longitud para la columna de la matriz B");
            numColB = sc.nextInt();  
        }
        int vectorA[][] = new int[numFilA][numColA];
        int vectorB[][] = new int[numFilB][numColB];
        int vectorSuma[][] = new int[numFilA][numColA];
        
        System.out.println("/nMatriz A");
        for (int i = 0; i < numFilA; i++) {
            System.out.println("Introduce num para fila A :" +(i +1));
            for (int j = 0; j < numColA; j++) {
                System.out.println("Introduce num para columna A :" +(j +1));
                vectorA[i][j] = sc.nextInt();
            }
        }
        System.out.println("/n Matriz B");
        for (int i = 0; i < numFilB; i++) {
            System.out.println("Introduce num para fila B :" +(i +1));
            for (int j = 0; j < numColB; j++) {
                System.out.println("Introduce num para columna B :" +(j +1));
                vectorB[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("/nSumamos matrices");
        for (int i = 0; i < numFilA; i++) {
            for (int j = 0; j < numColA; j++) {
                vectorSuma[i][j] = vectorA[i][j] + vectorB[i][j];
                System.out.println(vectorSuma[i][j] + " ");
            }
        }     
    } 
}
