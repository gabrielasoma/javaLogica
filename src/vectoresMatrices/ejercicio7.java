
package vectoresMatrices;

import java.util.Scanner;

/*
Define una función que diga cuantos días tiene un mes utilizando vectores
*/
public class ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int mes;
        System.out.println("Introduce un mes: ");
        mes = sc.nextInt();
        System.out.println("El mes "+ mes + " tiene " + diaMes(mes) +  " días");
      
        
    }
    
    public static int diaMes(int mes){
        
        int dia[] = new int[13];
        
        dia[1] = 31;
        dia[2] = 28;
        dia[3] = 31; 
        dia[4] = 30;
        dia[5] = 31;
        dia[6] = 30; // Corregido
        dia[7] = 31; 
        dia[8] = 31;
        dia[9] = 30;
        dia[10] = 31; 
        dia[11] = 30;
        dia[12] = 31;
        
        int calculo= dia[mes];
        
        return calculo;
    }
           
    
}
