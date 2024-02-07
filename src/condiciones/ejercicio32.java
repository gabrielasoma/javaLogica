
package condiciones;

import java.util.Scanner;

/*Escribe un programa que recibe un cáracter y diga si es una letra, un número o un símbolo
Si es una letra dirá su es mayúscula o minúscula*/

public class ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        char caracter;
        
        System.out.println("Introduce cáracter:");
        caracter = sc.next().charAt(0);
        
        if(caracter >= 'a' && caracter <='z'){
            System.out.println("El cáracter " + caracter+ " es una letra minúscula");
        }else if(caracter >= 'A' && caracter <='Z'){
            System.out.println("El cáracter " + caracter+ " es una letra mayuscula");
        }else if(caracter >= '0' && caracter <= '9'){
            System.out.println("El cáracter " + caracter+ " es un número");
        }else{
            System.out.println("El cáracter " + caracter+ " es un símbolo");
        }
    }
}
