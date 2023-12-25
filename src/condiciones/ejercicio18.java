
package condiciones;

import java.util.Scanner;

/*
Escribe un programa que compruebe si un triangulo es valido es base a sus angulos
Para que un triangulo sea valido, sus 3 angulos deben ser positivos, por debajo de 180, y la suma igual a 180
*/

public class ejercicio18 {
    
    public static void main(String[] args) {
        int ang1=0; 
        int ang2=0; 
        int ang3=0; 
        int suma =0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce primer angulo");
        ang1 = sc.nextInt();
        System.out.println("Introduce segundo angulo");
        ang2 = sc.nextInt();
        System.out.println("Introduce tercer angulo");
        ang3 = sc.nextInt();
        
        suma = ang1 + ang2 + ang3;
        
        if((ang1 < 180 && ang1 > 0) &&(ang2 < 180 && ang2 > 0) &&(ang3 < 180 && ang3 > 0) && (suma == 180)){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
    }
}
