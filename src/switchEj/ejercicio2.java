
package switchEj;

import java.util.Scanner;

/*Programa que calcula el precio final de un articulo. 
Se introduce precio sin descuento y su precio tendra descuento dependiendo del tipo de producto*/

public class ejercicio2 {
    public static void main(String[] args) {
        double precio=0;
        double precioFinal=0;
        int producto=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escoja categoría (num)");
        System.out.println("==================");
        System.out.println("1-. comida");
        System.out.println("2-. ropa");
        System.out.println("3-. electrodomesticos");
        System.out.println("4-. otros");
        producto = sc.nextInt();
        
        System.out.println("Introduce precio (sin descuento) ");
        precio = sc.nextDouble();
   
        
        switch(producto){
            case 1:
                precioFinal = precio - ( precio * (2.0/100)); 
                break;
            case 2:
                precioFinal = precio - (precio * (5.0/100)); 
                break;
            case 3:
                precioFinal = precio - (precio * (10.0/100)); 
                break;
            default:
                precioFinal = precio - (precio * (8.0/100)); 
                break;
        }
       
        System.out.println("Precio final: "+ precioFinal);
    }
}
