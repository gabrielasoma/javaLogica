
package condiciones;

import java.util.Scanner;

/*Escribe un programa que calcule el precio final de un artículo. El usuario introducirá el precio sin descuento *
 * y su precio final tendra un descuento que dependera de su precio
 */
public class ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Introduce el precio sin descuento:");
        double precioInicial = sc.nextDouble();
        double precioFinal;

        if (precioInicial < 20) {
            precioFinal = precioInicial;
        } else if (precioInicial >= 20 && precioInicial < 30) {
            precioFinal = precioInicial * 0.98; // Descuento del 2% para precios entre 20 y 29.99
        } else if (precioInicial >= 30 && precioInicial < 50) {
            precioFinal = precioInicial * 0.97; // Descuento del 3% para precios entre 30 y 49.99
        } else {
            precioFinal = precioInicial * 0.95; // Descuento del 5% para precios mayores o iguales a 50
        }

        System.out.println("El precio inicial es: " + precioInicial + ", el precio final con descuento es: " + precioFinal);
    }
}
