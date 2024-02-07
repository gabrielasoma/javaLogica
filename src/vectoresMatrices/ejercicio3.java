
package vectoresMatrices;

//Define una función que reciba un vector y un dato. La función devolverá la posición del vector en la que se encuenta el dato
//Si el dato no esta dentro del vector devolvera 0

import java.util.Scanner;


public class ejercicio3 {
    
    public static void main(String[] args) {
        
        int n;
        String nombre;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una cantidad de elementos para el vector");
        n= sc.nextInt(); /*tamaño del vector*/
        sc.nextLine();
      
        String vector[] =new String[n];
        
        //rellena el vector
        for (int i = 0; i < n; i++) {
            System.out.println("Introduzca el nombre: "+ i+ " :");
            vector[i] = sc.nextLine();
        }
        
        System.out.println("Introduzca un nombre a buscar");
        nombre = sc.nextLine();
        
        System.out.println("El nombre " + nombre + " esta en la posicion: " + posVector(vector,n, nombre));
    }
    
    public static int posVector(String[] vector, int n, String dato) {
        int posicion =-1;
        for (int i = 0; i < n; i++) {
            if(vector[i].equals(dato)){
                posicion = i;
                break;
            }
        }
       return posicion;
    }
}
