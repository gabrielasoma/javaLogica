
package condiciones;

import java.util.Scanner;

/*
Escribe un programa al que se le introduce una nota y muestra en pantalla si el alumno ha aprobado o no, dependiendo de su nota final
El alumno aprobara si su nota es mayor o igual a 5, y suspendera si su nota es menor de 5
*/

public class ejercicio14 {
    public static void main(String[] args) {
        
        double nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce nota");
        nota = sc.nextInt();
        
        if(nota>=5){
            System.out.println("El alumno ha aprobado");
        }else{
            System.out.println("El alumo ha suspendido");
        }
        
    }
}
