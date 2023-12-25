
package javaejercicios;

import java.util.Scanner;

/*Escribe un programa que calcule el seno,coneno y tangente de un angulo introducido por el usuario en grados
nota: 360º son 2Pi radianes
*/

public class ejercicio9 {
    public static void main(String[] args) {
        double grados =0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce los grados" );
        grados = sc.nextDouble();
        
        // Convertir grados a radianes ya que las funciones trigonométricas en Java utilizan radianes
        double radianes = Math.toRadians(grados);

        // Calcular seno, coseno y tangente
        double seno = Math.sin(radianes);
        double coseno = Math.cos(radianes);
        double tangente = Math.tan(radianes);

        // Mostrar resultados
        System.out.println("El seno de " + grados + " grados es: " + seno);
        System.out.println("El coseno de " + grados + " grados es: " + coseno);
        System.out.println("La tangente de " + grados + " grados es: " + tangente);

    }
}
