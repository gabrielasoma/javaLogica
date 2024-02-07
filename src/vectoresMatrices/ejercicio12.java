
package vectoresMatrices;

import java.util.Scanner;

/*
Escribe un programa que calcule la multiplicación de 2 matrices. 
Para realizar la multiplicación entre matrices, la cantidad de columnas de la primera matriz debe ser igual a la cantidad de filas de la segunda.
El resultado de cada elemento equivale a la suma de la multiplicación entre los elementos de la fila de la primera matriz y la columna de la segunda.
La matriz obtenida en la multiplicación tendrá la cantidad de filas de la primera matriz y la cantidad de columnas de la segunda.
Multiplicación de matrices:

A = ( 413
      602  
    )

B = (
    16
    51  
    03
    )

A * B = 
    (
    4*1 + 1*5 + 3*0          4*6 + 1*1 + 3*3
    6*1 + 0*5 + 2*0          6*6 + 0*1 + 2*3
    )

A * B = 
    (
    9   34  
    6   42
    )

*/


public class ejercicio12 {
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
        
        while((numColA != numFilB)){
            System.out.println("Error, la fila A y columna B deben tener la misma dimensión");
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
        int vectorMultiplicacion[][] = new int[numFilA][numColB];
        
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
        
        //Hacemos operaciones
        for (int i = 0; i < numFilA; i++) {
            for (int j = 0; j < numColB; j++) {
                for (int k = 0; k < numColA; k++) {  // Itera para realizar la multiplicación y suma
                    // Multiplicación de matrices y acumulación del resultado en la matriz resultante
                    vectorMultiplicacion[i][j] += vectorA[i][k] * vectorB[k][j];
                }             
            }
        }
        
        //Resultado
        System.out.println("\nMatriz A * B");
        for (int i = 0; i < numFilA; i++) {
            for (int j = 0; j < numColB; j++) {
                System.out.print(vectorMultiplicacion[i][j] + " ");
            }
            System.out.println(); 
        }
        
        
    }   
}
