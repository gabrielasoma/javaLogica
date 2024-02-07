
package repeticion;

import java.util.Scanner;

//Programa que solicite contraseña y usuario hasta que el usuario acierte o falle 3 veces. Contreña real almacenada en variable
//Si acierta: "acceso permitido" , si falla: "cuenta bloqueada" y se terminara.
//Si falla mostrar intentos restantes

public class ejercicio2 {
    public static void main(String[] args) {
        
        String pass = "gaby";
        String passUsu ="";
        int restante = 3;
        boolean acierto = false;
        
        Scanner sc = new Scanner(System.in);
        
        while(restante != 0 && acierto == false){
            System.out.println("Introduce pass: ");
            passUsu = sc.nextLine();
            
            if(pass.equals(passUsu)){
                acierto = true;
                System.out.println("Acceso correcto");
            }else{
                restante = restante -1;    
                System.out.println("Contraseña incorrecta, te quedan "+ restante +  " intentos");
            }
            if(restante == 0){
                System.out.println("CUENTA BLOQUEADA");
            }
        }        
    }
}
