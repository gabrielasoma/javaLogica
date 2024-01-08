
package condiciones;

import java.util.Scanner;

/*
Escribe un programa que muestre la multa que recibirá un conductor dependiendo de su velocidad
<=50km/h 0€
>50km/h &&<=60km/h 50€
>60km/h &&<=70km/h 100€
>70km/h &&<=80km/h 200€
>80km/h &&<=100km/h 500€
>100km/h retirada de carnet

*/

public class ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int km = 0;    
        int euros=0;
        int multaTotal=0;
        String noCarnet = "Retirada de carnet";
         
        System.out.println("Introduce km/h: ");
        km = sc.nextInt();
        
        if (km <= 50) {
            System.out.println("No tienes multa");
        } else if (km > 50 && km <= 60) {
           euros = 50;
        } else if (km > 60 && km <= 70) {
           euros = 100;
        } else if (km > 70 && km <= 80) {
           euros = 200;
        } else if (km > 80 && km <= 100) {
           euros = 500;
        } else {
            System.out.println("Lo sentimos, te has pasado de 100km/h: "+ noCarnet);
        }

        System.out.println("Tienes que pagar de multa "+ euros);
    }
  
}
