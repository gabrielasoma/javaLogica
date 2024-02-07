
package repeticion;

import java.util.Scanner;

/*
Escribe un programa que solicite la nota de diferentes alumnos de forma repetitiva, hasta que el usuario introduzca "-1" 
Cada vez que el usuario introduzca una nota, se mostrará un mensaje que diga si el alumno a aprobado o no, y al final de la ejecución se mostrará 
la cantidad de alumnos aprobados y suspendidos, además de la nota media de la clase. Si la nota introducida no es válida (no está entre 0 y 10), 
se mostrará un mensaje, y esa nota no contará para los cálculos finales
*/

public class ejercicio3 {
    public static void main(String[] args) {
        int nota = 0;
        int contAprobados = 0, contSuspendidos = 0;
        double sumaNotasAprobadas = 0, sumaNotasSuspendidas = 0;

        Scanner sc = new Scanner(System.in);

        while (nota != -1) {
            System.out.println("Introduce nota (o -1 para salir): ");
            nota = sc.nextInt();

            if (nota != -1) {
                if (nota >= 0 && nota <= 10) {
                    if (nota >= 5) {
                        System.out.println("Aprobado");
                        contAprobados++;
                        sumaNotasAprobadas += nota;
                    } else {
                        System.out.println("Suspendido");
                        contSuspendidos++;
                        sumaNotasSuspendidas += nota;
                    }
                } else {
                    System.out.println("Nota no válida");
                }
            }
        }

        System.out.println("\n=== Resultado ===");
        System.out.println("Aprobados: " + contAprobados);
        System.out.println("Suspendidos: " + contSuspendidos);

        if (contAprobados > 0) {
            double mediaAprobados = sumaNotasAprobadas / contAprobados;
            System.out.println("Media de aprobados: " + mediaAprobados);
        } else {
            System.out.println("No hay alumnos aprobados");
        }

        if (contSuspendidos > 0) {
            double mediaSuspendidos = sumaNotasSuspendidas / contSuspendidos;
            System.out.println("Media de suspendidos: " + mediaSuspendidos);
        } else {
            System.out.println("No hay alumnos suspendidos");
        }
    }
    
}
