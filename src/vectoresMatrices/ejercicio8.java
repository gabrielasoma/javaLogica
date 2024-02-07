
package vectoresMatrices;

import java.util.Scanner;

/*
Define un procedimineot que diga cual es el numero mas repetido en un vector y cuantas veces se repite;
*/
public class ejercicio8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int longitud;
        
        System.out.println("Introduce longitud del vector");
        longitud = sc.nextInt();
        
        int vector[] = new int [longitud];
         
        System.out.println("Ingrese los valores del vector:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        
        calculo(vector, longitud);
        
    }

    public static void calculo (int vector[], int longitud){
       int vecesRepetido =0;
       int numeroMasRepetido =0;
        
        for (int i = 0; i < longitud; i++) {
            int contador = 1;
            //bucle para comparar con los elementos siguientes en el array 
            for (int j = i+1; j < longitud; j++) { // es j = i+ 1 para que no se compare con el mismo elemento sino con el siguiente
                //verifica si son iguales los vectores
                if(vector[i] == vector[j]){
                    //si es asi suma el contador de cuantas veces se repite el mismo elemento
                    contador++;
                }
            }
            //Al estar dentro del for va actualizando el numero mas repetido y cuantas veces aparece
            if(contador> vecesRepetido){
                numeroMasRepetido = vector[i];
                vecesRepetido = contador;
            }
        }
        
        System.out.println("Número más repetido: " + numeroMasRepetido);
        System.out.println("Veces repetido: " + vecesRepetido);
    }
}   




