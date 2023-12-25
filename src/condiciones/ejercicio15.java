
package condiciones;

import java.util.Scanner;

/*
Escribe un programa que diga si un numero esta dentro o fuera de un rango
El usuario introduce el limite inferior y superior y el numero que se desea comprobar
*/
public class ejercicio15 {
    
    public static void main(String[] args) {
        
        int num;
        int max;
        int min;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce max");
        max = sc.nextInt();
        System.out.println("Introduce min");
        min = sc.nextInt();        
        System.out.println("Introduce numero");
        num = sc.nextInt();
        
        if(num<=max && num>=min){
            System.out.println("El numero esta en el rango");
        }else{
            System.out.println("Fuera de rango");
        }        
    }
}
