package javaejercicios;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
    /*Calcula el sueldo semanal de una persona considerando las horas trabajadas. Las horas normales (hasta un maximo de 40 horas semanales)
      se cobran a 10€/hora. Las horas extra, se cobran a 12€/hora*/   
        
        System.out.println("Sueldo semanal");
        int horas=0;
        int total= 0;
        int total1=0;
        int sueldo= 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, introduce horas semanales");
        horas = sc.nextInt();
        
        if(horas > 40){
            total = 40 * 10 ;
            total1 = (horas - 40) * 12;
            sueldo = total + total1;
            System.out.println("Ha trabajado " + sueldo + " horas, incluyendo hotas extras");
        }else{
            total = horas * 10;
            System.out.println("Ha trabajado " +  total + " horas");
        }
        
        
    }
    
}
