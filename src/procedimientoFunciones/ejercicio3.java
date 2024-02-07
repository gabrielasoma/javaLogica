
package procedimientoFunciones;

//Escribe un programa que escribe una secuencia de números mediante un procedimiento. El usuario introducirá unos cuantos números de la secuencia se mostraran (n) y en base 

import java.util.Scanner;

//a qué número se definirá esa secuencia (m)
public class ejercicio3 {
    public static void main(String[] args) {
        int num;
        int cantidad;
        Scanner sc = new Scanner(System.in);               
        System.out.println("Introduce un número ");
        num = sc.nextInt();
        System.out.println("Introduce cantidad de la secuencia ");
        cantidad = sc.nextInt();
        secuencia(num,cantidad);   
    }
    
   
    public static void secuencia(int m,int n){
        for (int i = 0; i < n; i++) {
            System.out.println(m * i);
        }
       
    }
    
}
