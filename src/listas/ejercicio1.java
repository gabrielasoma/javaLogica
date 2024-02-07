
package listas;

import java.util.ArrayList;
import java.util.List;


public class ejercicio1 {
    public static void main(String[] args) {
        
        List<String> lista_nombres = new ArrayList<>();
        
        //Añadir
        lista_nombres.add("Gaby");
        lista_nombres.add("Dani");
        lista_nombres.add("Gisella");
        lista_nombres.add("Pedro");
               
        System.out.println(lista_nombres);
        System.out.println("tamaño: "+lista_nombres.size());
        
        //Eliminar
        System.out.println("Posición 0: "+lista_nombres.get(0));
        
        System.out.println("Eliminamos posición 1");
        lista_nombres.remove(1);
        System.out.println("Después de eliminar: " + lista_nombres);
        
        //Fors
        System.out.println("For");
        for (String n: lista_nombres) {
            System.out.println("Nombre: " + n);
        }
        
    }
}
