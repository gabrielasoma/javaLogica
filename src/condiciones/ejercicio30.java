
package condiciones;

import java.util.Scanner;

/*escribe un programa que reciba la longitud de los 3 lados de un triángulo y diga si es 
equilátero (3 lados iguales), 
isósceles (2 lados iguales) o escaleno (ningún lado igual)*/

public class ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Introduce lado 1:");
        double num1 = sc.nextDouble();

        System.out.println("Introduce lado 2:");
        double num2 = sc.nextDouble();

        System.out.println("Introduce lado 3:");
        double num3 = sc.nextDouble();

        if(num1 == num2 && num1 == num3) {
            System.out.println("Triángulo equilátero");
        } else if(num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Triángulo isósceles");
        } else {
            System.out.println("Triángulo Escaleno");
        }
        
    }
}
