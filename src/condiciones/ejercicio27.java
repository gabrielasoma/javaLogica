
package condiciones;

import java.util.Scanner;

/*
Escribe un programa que diga cual es el mayor entre 4 numeros introducidos por el usuario
*/

public class ejercicio27 {
    public static void main(String[] args) {
        int num = 0;
        int max = -100;
        
        Scanner sc = new Scanner(System.in);
       
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce número: ");
            num = sc.nextInt();
          
            if (num> max ){
                max = num;
            }            
        }   
        System.out.println("El numero mayor es: " + max);
    }
   
}
