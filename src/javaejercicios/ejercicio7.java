
package javaejercicios;

import java.util.Scanner;

/*
Escribe un programa que solicite una temperatura al usuario en Celsius (C) y muestre la conversion a Fahrenheit(F) y kelvin(K)
Las conversiones de Celsiur a Fahrenheit y Kelvin:
F = 9/5C + 32
K = C + 273.15

*/

public class ejercicio7 {
    public static void main(String[] args) {
       
    double c =0;
    double F=0;
    double K=0;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce la temperatura");
    c = sc.nextDouble();
    F = 9 / 5 * c + 32;
    K= c + 273.15;
    System.out.println("F : "+ F);
    System.out.println("K : "+ K);
    
    }
}
