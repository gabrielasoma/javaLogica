
package condiciones;
//Decisiones anidadas

import java.util.Scanner;

/*Queremos saber si es par o impar y si es divisible o indivisible por el numero 3*/
public class ejercicio23 {
    
    public static void main(String[] args) {
        int num =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        num = sc.nextInt();
        
        if(num %  2 ==0){
            System.out.println("Par");
        }
        if(num % 3==0){
            System.out.println("El número es divisible por 3");
        }else {
            System.out.println("Número indivisible por 3");
        }
            
        System.out.println("\nOtra manera\n");
        
        if(num %  2 ==0){
            if(num % 3==0){
                System.out.println("El número es par y divisible por 3");
            }else {
                System.out.println("Número par indivisible por 3");
            }
        }else{
            if(num % 3==0){
                System.out.println("El número es impar y divisible por 3");
            }else {
                System.out.println("Número impar indivisible por 3");
            }
        }
    }
}
