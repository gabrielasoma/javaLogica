
package javaejercicios;

import java.util.Scanner;

/*
Escribe un programa que solicite al usuario un num de 3 digitos y realice la suma de los 3 digitos
483 = 4 + 8 + 3 = 15

*/

public class ejercicio11 {
    public static void main(String[] args) {
      
        String num3d;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce num de 3 digitos" );
        num3d= sc.nextLine();

        int suma = 
                Integer.parseInt(num3d.substring(0, 1)) +
                Integer.parseInt(num3d.substring(1, 2)) +
                Integer.parseInt(num3d.substring(2));

        System.out.println("La suma de los dígitos es: " + suma);

    }

   
}
