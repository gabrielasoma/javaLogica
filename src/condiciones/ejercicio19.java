
package condiciones;

import java.util.Scanner;

/*
Escribe un programa que compruebe si un triangulo es valido a base a sus laterales.
Para que un triangulo sea valido, la suma de los 2 laterales cualesquiera debe ser superior al otro lateral

*/

public class ejercicio19 {
    
    public static void main(String[] args) {
        int lat1=0; 
        int lat2=0; 
        int lat3=0; 
        int suma1 =0;
        int suma2 =0;
        int suma3 =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce primer lateral");
        lat1 = sc.nextInt();
        System.out.println("Introduce segundo lateral");
        lat2 = sc.nextInt();
        System.out.println("Introduce tercer lateral");
        lat3 = sc.nextInt();
        
        suma1 = lat1 + lat2;
        suma2 = lat2 + lat3;
        suma3 = lat1 + lat3;
        
        if((suma1 > lat3) && (suma2 > lat1) && (suma3 > lat2) ){
            System.out.println("Valido");
        }else{
            System.out.println("No valido");
        }
        
    }
}
