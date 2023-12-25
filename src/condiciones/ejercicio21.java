
package condiciones;

import java.util.Scanner;

/*
Una agencia de seguros unicamente asegura a personas que cumplan:
este casada
no este casada, sea hombre y mas de 30 años
no este casada, sea mujer y mas de 25
Comprobar si esta asegurada o no

*/
public class ejercicio21 {
    public static void main(String[] args) {
        int edad=0;
        boolean casado=true;
        String sexo="";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el sexo[H/M]");
        sexo = sc.nextLine();
        System.out.println("Esta casado[true/false]");
        casado = sc.nextBoolean();
        System.out.println("Dime la edad ");
        edad = sc.nextInt();       
       
        
        if(casado || (!casado && sexo.equals("H") && edad > 30) || (!casado && sexo.equals("M") && edad > 25)){
            System.out.println("Asegurado");
        }else{
            System.out.println("No asegurado");
        }
        
    }
}
