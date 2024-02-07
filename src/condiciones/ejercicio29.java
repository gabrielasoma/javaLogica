
package condiciones;

import java.util.Scanner;

/*Escribe un programa que solicite 3 numero al usuario y los ordene de menor a mayor*/
public class ejercicio29 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Introduce el primer número:");
        double num1 = sc.nextDouble();

        System.out.println("Introduce el segundo número:");
        double num2 = sc.nextDouble();

        System.out.println("Introduce el tercer número:");
        double num3 = sc.nextDouble();

        // Ordenar los números de menor a mayor con condicionales
        if (num1 > num2) {
            // Intercambiar num1 y num2 si num1 es mayor
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            // Intercambiar num2 y num3 si num2 es mayor
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            // Intercambiar num1 y num2 nuevamente si es necesario
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Mostrar los números ordenados
        System.out.println("Números ordenados de menor a mayor: " + num1 + ", " + num2 + ", " + num3);
    }
}

