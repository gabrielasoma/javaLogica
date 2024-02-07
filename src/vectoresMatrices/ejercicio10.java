
package vectoresMatrices;

import java.util.Scanner;

/*
Escribe un programa que muestre la transpuesta de una matriz de cualquier tamaño.
Matriz trasnpuesta:

a = ( 123 )
    ( 456 )
    ( 789 )


aT= ( 147 )
    ( 258 )
    ( 369 ) 

*/

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int vector[][] = new int [3][3];
        int vectorTranspuesto[][] = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce fila " + (i+1));
            for (int j = 0; j < 3; j++) {
                System.out.println("Introduce columna " + (j+1));
                vector[i][j] = sc.nextInt();
            }        
        }
        System.out.println("/nVector transpuesto: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vectorTranspuesto[i][j] = vector[j][i];
                System.out.println(vectorTranspuesto[i][j] + " ");
            }
            System.out.println("");
        }
        
        
    }
}
