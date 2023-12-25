
package javaejercicios;

import java.util.Scanner;
import java.lang.Math;
import static java.lang.Math.PI;
/*
Escribe un programa que solicite al usuario el radio de un circulo y calcule el area y perimetro del circulo en base a dicho parametro. 
La formula para el calculo de area y perimetro son;
a = p*r2
p = 2*pi*R

*/


public class ejercicio6 {
    public static void main(String[] args) {
        double radio =0;
        double area =0;
        double perimetro =0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el radio del circulo");
        radio = sc.nextDouble();
        
        area = PI * Math.pow(radio, 2);
        perimetro = 2* PI * radio;
        System.out.println("El area es: "+ area);
        System.out.println("El perimetro es: "+ perimetro);
    }
}
