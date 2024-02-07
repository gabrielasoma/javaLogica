
package switchEj;

import java.util.Scanner;

/*escribe nombre y que devuelva su capital*/

public class ejercicio3 {
    public static void main(String[] args) {
        String pais = "";
        String capital ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce país: ");
        pais = sc.nextLine();
        
        switch(pais){
            case "Espana":
                capital = "Madrid";
                break;
            case "Francia":
                capital = "Paris";
                break;    
            case "Italia":
                capital = "Roma";
                break;
            case "Portugal":
                capital = "Lisboa";
                break;
            default:
                capital = "Nada";
                break;
        }
        System.out.println("Pais: "+pais + " ,capital: "+capital);
    }
    
}
