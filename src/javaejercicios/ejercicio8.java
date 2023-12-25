
package javaejercicios;

import java.util.Scanner;

/*
Escribe un programa que solicite al usuario los 3 coeficientes de una ecuacion de segundo grado y calcule y muetre en la consola las dos soluciones de la ecuacion
(-b +- raiz b^2 -4 ac)/(2a)
*/

public class ejercicio8 {
    
    public static void main(String[] args) {
        double a =0;
        double b=0;
        double c=0;
        double sol1=0;
        double sol2=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce primer numero");
        a = sc.nextDouble();
        System.out.println("Introduce segundo numero");
        b = sc.nextDouble();
        System.out.println("Introduce tercer numero");
        c = sc.nextDouble();
        
        sol1 = (-b + Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
        sol2 = (-b - Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
        
        System.out.println("La raíz cuadra (+) es: " +sol1);
        System.out.println("La raíz cuadra (-) es: " +sol2);
        
        
    }
}
