
package condiciones;

import java.util.Scanner;
/*
Escribe un programa que diga si un numero esta dentro de dos rangos separados.
El usuario introduce el limite inferior y superior de los rangos, y el numero que se desa comprobar

*/

public class ejercicio16 {
    
    public static void main(String[] args) {
        int num1;
        int max1;
        int min1;
        
        int max2;
        int min2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce min 1");
        min1 = sc.nextInt();
        System.out.println("Introduce max 1");
        max1 = sc.nextInt();
               
        System.out.println("Introduce min 2");
        min2 = sc.nextInt();    
        
        System.out.println("Introduce max 2");
        max2 = sc.nextInt();
           
        System.out.println("Introduce numero 1");
        num1 = sc.nextInt();
        
        if((num1<=max1 && num1>=min1) ||(num1<=max2 && num1>=min2)  ){
            System.out.println("El numero esta en el rango");
        }else{
            System.out.println("Fuera de rango");
        }              
    }
}
