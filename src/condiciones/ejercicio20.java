
package condiciones;

import java.util.Scanner;
/*Escribe un programa que compruebe si una letra es una vocal o consonante*/

public class ejercicio20 {
    public static void main(String[] args) {
        
        char letra; // Cambiado a tipo char para almacenar solo una letra
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una letra: ");
       
        letra = sc.next().charAt(0); // Leer el primer carácter

        // Convertir a minúscula
        letra = Character.toLowerCase(letra);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("Es vocal");
        } else {
            System.out.println("Es consonante");
        }        
    }
}
