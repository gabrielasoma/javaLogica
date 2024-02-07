
package vectoresMatrices;

import java.util.Scanner;

/*
    Matriz notas, alumnos y asignaturas
    
*/

public class ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int notas[][] = new int[2][3]; // filas (alumnos) y columnas (asignaturas)

        // Solicitar y almacenar las notas de los alumnos
        for (int i = 0; i < 2; i++) { 
            System.out.println("Introduce las notas del alumno " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.println("Introduce la nota de la asignatura " + (j + 1));
                notas[i][j] = sc.nextInt();
            }
        }
        System.out.println("================Resultado===========================");
        
        // Mostrar las notas de los alumnos
        for (int i = 0; i < 2; i++) {
            System.out.println("Las notas del alumno " + (i + 1) + " son:");
            for (int j = 0; j < 3; j++) {
                System.out.println("Asignatura " + (j + 1) + ": " + notas[i][j]);
            }
        }
       
    }
}

