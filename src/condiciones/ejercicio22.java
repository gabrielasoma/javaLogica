
package condiciones;

import java.util.Scanner;

/*
Escribe un programa que diga la cantidad minima de billetes y monedas necesarios para obtener una cantidad de dinero (solo num enteros)
Para que la cantidad de billetes sea min, el valor de los billites debe ser el max posible
Los billetes seran de 500, 200, 100, 50, 20, 10 y 5 y las monedas unicamente de 1
Ej: 
798€

500€: 1 billete
200: 1 billete
100€: 0 billetes
50€: 1 billete
20€: 2 billete
10: 0 billetes
5: 1 billete 
1: 3 monedas

798

500
200
50
20
20
5
3€
*/

public class ejercicio22 {
    
    public static void main(String[] args) {
        int cantidadTotal;
        int bil500 = 0;
        int bil200 = 0;
        int bil100 = 0;
        int bil50 = 0;
        int bil20  = 0;     
        int bil10 = 0;
        int bil5 = 0;
        int moneda = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad total");
        cantidadTotal = sc.nextInt();
        
        int cantidadRestante = cantidadTotal;
        
        if(cantidadRestante > 500){//truncado (redondear)
            bil500 = (int)(cantidadRestante/500);
            cantidadRestante = cantidadRestante - bil500 * 500;
        }
        if(cantidadRestante > 200){//truncado (redondear)
           bil200 = (int)(cantidadRestante/200);
            cantidadRestante = cantidadRestante - bil200 * 200;
        }   
        if(cantidadRestante > 100){//truncado (redondear)
            bil100 = (int)(cantidadRestante/100);
            cantidadRestante = cantidadRestante - bil100 * 100;
        }
        if(cantidadRestante > 50){//truncado (redondear)
            bil50 = (int)(cantidadRestante/50);
            cantidadRestante = cantidadRestante - bil50 * 50;
        }        
        if(cantidadRestante > 20){//truncado (redondear)
            bil20 = (int)(cantidadRestante/20);
            cantidadRestante = cantidadRestante - bil20 * 20;
        }
        if(cantidadRestante > 10){//truncado (redondear)
            bil10 = (int)(cantidadRestante/10);
            cantidadRestante = cantidadRestante - bil10 * 10;
        }
        if(cantidadRestante > 5){//truncado (redondear)
            bil5 = (int)(cantidadRestante/5);
            cantidadRestante = cantidadRestante - bil5 * 5;
        }
        int monedas = cantidadRestante;
        
        System.out.println("Para" + cantidadTotal + " se necesitan: ");
        System.out.println("Billetes de 500: " + bil500);
        System.out.println("Billetes de 200: " + bil200);
        System.out.println("Billetes de 100: " + bil100);
        System.out.println("Billetes de 50: " + bil50);
        System.out.println("Billetes de 20: " + bil20);
        System.out.println("Billetes de 10: " + bil10);
        System.out.println("Billetes de 5: " + bil5);
        System.out.println("Monedas: " + monedas);
        
    }
}
