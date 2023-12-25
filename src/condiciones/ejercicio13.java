
package condiciones;

import java.util.Scanner;

/*
Escribe un programa que calcule el precio final del articulo.
El usuario introducira el precio sin descuento y su precio final tendra un descuento del 5% unicamente si su precio es superior  a 40€+
 30€  -> precio final 30€
 100€ -> precio final 95€
*/

public class ejercicio13 {
    
    public static void main(String[] args) {
        int num =0;
        double total =0;
        double descuento;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce numero");
        num = sc.nextInt();

        if(num > 40){
            descuento = num * 0.05;
            total = num - descuento;
            System.out.println("El total con descuento es: " + total);
        }else{
            System.out.println("El total es: "+ total);
        }
        
    }
}
