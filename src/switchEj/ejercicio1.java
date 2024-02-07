
package switchEj;

import java.util.Scanner;

/*
Solicita dia de semana y que muestre la posicion
*/
public class ejercicio1 {
    public static void main(String[] args) {
        int dia;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce dia de la semana: ");
        dia = sc.nextInt();
        
        switch(dia){
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("Dia incorrecto");
                break;
        }
    }
}
