
package javaejercicios;

import java.util.Scanner;

/*
Escribe un programa que solicite una cantidad de segundos al usuario, y devuelva la cantidad de horas, minutos y segundos a los que equivale
Ej: 11781 seg equivalen a 3 horas, 16 min y 21 segundos

1h = 60 min
1h = 3.600 seg
1 min = 60seg

*/

public class ejercicio10 {
    public static void main(String[] args) {
        double seg =0;
        double min=0;
        double h=0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce los segundos" );
        seg = sc.nextDouble();
        
        min = seg / 60;
        h = seg/(60 * 60);
       
        
        System.out.println("Son " + seg + " segundos");
        System.out.println("Son " + min + " minutos");
        System.out.println("Son " + h + " horas");
    }
}
