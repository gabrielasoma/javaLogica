

package vectoresMatrices;

import java.util.Scanner;

/*Escribe un programa que reciba el DNI de una persona y, trabajando con vectores, diga si dicho DNI es real o no.
Se considera que el DNI es real si la letra introducida coincide con la letra que deberñia tener en base a su número
8 num y 1 letra
*/

public class ejercicio6 {
    public static void main(String[] args) {
        String dni = "";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu DNI:");
        dni = sc.nextLine();

        // Extrae la parte numérica del DNI (8 dígitos)
        String substringDni = dni.substring(0, 8);

        // Convierte la parte numérica a un número entero
        int iDni = Integer.parseInt(substringDni);

        // Extrae la letra del DNI (último carácter)
        String letraDni = dni.substring(8, 9);

        // Muestra información sobre el DNI ingresado
        System.out.println("DNI: " + dni);
        System.out.println("Número: " + iDni);
        //System.out.println("Letra: " + letraDni);

        // Llama a la función para verificar si el DNI es real
        real(iDni, letraDni);

        
    }

    public static void real(int iDni, String  letraDni){
    
        char letras[] = new char[23];
    
        letras[0] = 'T'; //resto de 0
        letras[1] = 'R'; //resto de 1
        letras[2] = 'W'; //resto de 2
        letras[3] = 'A'; //resto de 3
        letras[4] = 'G'; //resto de 4
        letras[5] = 'M'; //resto de 0
        letras[6] = 'Y'; //resto de 0
        letras[7] = 'F'; //resto de 0
        letras[8] = 'P'; //resto de 0
        letras[9] = 'D'; //resto de 0
        letras[10] = 'X'; //resto de 0
        letras[11] = 'B'; //resto de 0
        letras[12] = 'N'; //resto de 0
        letras[13] = 'J'; //resto de 0
        letras[14] = 'Z'; //resto de 0
        letras[15] = 'S'; //resto de 0
        letras[16] = 'Q'; //resto de 0
        letras[17] = 'V'; //resto de 0
        letras[18] = 'H'; //resto de 0
        letras[19] = 'L'; //resto de 0
        letras[20] = 'C'; //resto de 0
        letras[21] = 'K'; //resto de 0
        letras[22] = 'E'; //resto de 0
    
        // Calcula la letra asociada al número de DNI
        char letraCalculada = letras[iDni % 23];
        
        //charAt(0) obtiene el elemento de esa posicion
        // Compara la letra introducida con la letra calculada y muestra el resultado
        if (letraDni.charAt(0) == letraCalculada) {
            System.out.println("DNI REAL");
        } else {
            System.out.println("DNI falso");
        }       
           
        
    }
  
}
