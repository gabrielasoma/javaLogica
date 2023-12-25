
package condiciones;

import java.util.Scanner;

/*
Escribe un programa que solicite un usuario y contraseña. El usuario y constraseña validos estaran almacenados como variables en el programa.
Si el usuario y pass son iguales, dira "Acceso permitido"
Si no dira "Acceso denegado"
Con usuario no sera sensitivo a mayuscula, pero la contraseña si

*/

public class ejercicio17 {
    public static void main(String[] args) {
        String user = "Gaby" ;
        String pass = "123";
        
        String userN="";
        String passN="";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce usuario");
        userN = sc.nextLine();
        System.out.println("Introduce pass");
        passN = sc.nextLine();
        
        if (user.equalsIgnoreCase(userN) && pass.equals(passN)) {//equalsIgnoreCase ignora mayuscula y minuscula
        System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
        
    }
}
