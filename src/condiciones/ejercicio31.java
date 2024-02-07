
package condiciones;

import java.util.Scanner;

/*Escribe un programa que reciba una coordenada (x,y) y diga a que cuadrante pertenece*/
/*
2º cuadrante (-, +)  1º cuadrante (++)
3º cuadrante (-, -)  4º cuadrante (+-)
*/

public class ejercicio31 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce x:");
        double x = sc.nextDouble();
        System.out.println("Introduce y:");
        double y = sc.nextDouble();
        
        if(x > 0 && y > 0){
            System.out.println("Primer cuadrante");
        }else if (x<0 && y>0){
            System.out.println("Segundo cuadrante");
        }else if(x<0 && y<0){
            System.out.println("Tercer cuadrante");
        }else{
            System.out.println("Cuarto cuadrante");
        }            
        
    }
}
