
package condiciones;

import java.util.Scanner;

/*decir si un numero es par o impar*/

public class ejercicio12 {
    public static void main(String[] args) {
        int num =0;
               
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce numero");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("Es impar");
        }
        
    }
}
