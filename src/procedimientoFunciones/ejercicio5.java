
package procedimientoFunciones;

import java.util.Scanner;

/*Define una función que diga si un número es primo o no.
La función recibirá como argumento de entrada el número que se desea realizar, y su salida será un valor booleano*/

public class ejercicio5 {
    
    public static void main(String[] args) {
        int num=0;
        Scanner sc = new Scanner(System.in);               
        System.out.println("Introduce un numero ");
        num = sc.nextInt();
         if (primo(num)) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " NO es un número primo.");
        }
    }
    
    public static boolean primo(int num){
        int divisores =0;
        
        for (int i = 1; i <= num; i++) { 
            if (num % i == 0) {//verifica si i es un divisor de num
                divisores = divisores + 1;               
            }

            if (divisores > 2) {               
                return false;  // Si encuentra más de 2 divisores, no es primo
            }
        }
    return divisores == 2;  // Después de comprobar todos los divisores
    }
}

    
        

