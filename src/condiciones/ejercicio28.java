
package condiciones;

import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args) {
       /*Los estudiantes de un curso se dividen en grupo Ay B, dependiendo de su nombre y edad:
        A: esta compuesto por personas con edades por debajo de los 20 años cuya inicial del nombre es anterior a la M y personas con 20 años o más
        más cuya inicial es posterior a la N.
        B: compuesto por las otras personas
        Escribe un programa que diga a qué grupo pertenece una persona, dependiendo de su nombre y edad
        */
       
        int edad;
        String nombre;
        String grupo;
        Scanner sc = new Scanner(System.in);
       
       
        System.out.println("Introduce nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Introduce edad: ");
        edad = sc.nextInt();
        
        // Obtenemos una subcadena desde el índice 0 hasta el índice 4 (sin incluir el índice 4)
        String inicial = nombre.substring(0, 1);
        if(edad < 20){
            if (inicial.compareTo("M") < 0){ /*esto hace que coincida, orden alfabético*/
                grupo = "A";
            }else{
                grupo="B";
            }           
        }else{
            if (inicial.compareTo("N") > 0){ /*esto hace que coincida, orden alfabético*/
                grupo = "A";
            }else{
                grupo="B";
            }     
        }
        System.out.println("Perteneces al grupo " + grupo);     
    }
    
}
