
package vectoresMatrices;

//Vectores

import java.util.Scanner;


public class ejercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] edades = new int[3];  
        String[] nombre = new String[3] ;
        int n = 2;//3 elementos  (se empieza en 0)
        /*
        edades[0] = 21;
        edades[1] = 22;
        edades[2] = 23;

        nombre[0] = "Juan";
        nombre[1] = "Carlos";
        nombre[2] = "Antonio";
        */
        
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce un nombre");
            nombre[i] = sc.nextLine();
            System.out.println("Introduce edad");
            edades[i] = sc.nextInt();
            sc.nextLine();//salto de línea 
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(nombre[i] +  " tiene "+ edades[i] +  " años");
        }
        sc.close();//cerramos objeto escaner para liberar recurso
    }
}
