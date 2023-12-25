
package javaejercicios;

import java.util.Scanner;

/*Escribe un programa que calcule la nota media de una alumno en base a 4 notas diferentes, introducidas por usuario. 
Examen 1: 10%
Examen 2: 25%
Examen 3: 50%
Examen 4: 15%

*/

public class ejercicio4 {
    public static void main(String[] args) {
     double  num1=0;
     double num2=0;
     double num3=0;
     double num4=0;
     double media=0;
     double total =0;
     double porcentaje=0;
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Introduce la primera nota: ");
     num1 = sc.nextDouble();
     
     System.out.println("Introduce la segunda nota: ");
     num2 = sc.nextDouble();
     
     System.out.println("Introduce la tercera nota: ");
     num3 = sc.nextDouble();
     
     System.out.println("Introduce la cuarta nota: ");
     num4 = sc.nextDouble();
     
    
   
     media = (num1 * 0.1 + num2 * 0.25 + num3 * 0.5  + num4 * 0.15) /4;
     
     System.out.println("\nLa media es: " + media);
    
     
    }
 
}
