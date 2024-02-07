
package listas;

import java.util.ArrayList;
import java.util.List;


public class ejercicio2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(15);
        num.add(21);
        
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }
        
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Jesus");
        nombres.add("Pedro");
        nombres.add("Carlos");
        nombres.add("Lucas");
        
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        System.out.println("Contains Carlos? : " + nombres.contains("Carlos"));
    }
}
