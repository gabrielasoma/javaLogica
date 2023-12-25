
package javaejercicios;

import java.util.Scanner;

/*Escribe un prgrama que solicite dos numeros al usuario y muestre en la consola el resultado de la suma, resta, multiplicacion y division*/
public class ejercicio2 {
    public static void main(String[] args) {
        double num1 =0;
        double num2 =0;
        double total =0;
        int opcion =0;
        
      
        Scanner sc = new Scanner(System.in);
        
                
        System.out.println("Por favor, introduce el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Por favor, introduce el segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Elige entre el 1 a 4");
        opcion = sc.nextInt();
        switch(opcion){
            case 1 :
                total = num1 + num2;
                System.out.println("La suma es :" + total);                
            return;
           
            case 2 :
                total = num1 - num2;
                System.out.println("La resta es :" + total);                
            return;
            case 3 :
                total = num1 * num2;
                System.out.println("La multiplicacion es :" + total);                
            return;
             case 4 :
                total = num1 / num2;
                System.out.println("La division es :" + total);                
            return;
             default:
                 System.out.println("Escoga un numero");
        }
        
    }
 
}
