
package javaejercicios;

import java.util.Scanner;

public class ejercicio3 {
    /*Escribe un programa que calcule la nota media de un alumno en base a 3 notas diferentes introducidas por usuario*/
    public static void main(String[] args) {
        int num1 =0;
        int num2 =0;
        int num3= 0;
        int media =0;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Introduce primera nota: ");
        num1 = sc.nextInt();
        System.out.println("Introduce segunda nota: ");
        num2 = sc.nextInt();
        System.out.println("Introduce tercera nota: ");
        num3 = sc.nextInt();
        media = (num1 + num2 + num3)/3;
        
        System.out.println("La media es "+ media);
    }
}
