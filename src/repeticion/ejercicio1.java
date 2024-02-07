
package repeticion;

//Mientras
//Pide numeros hasta poner 0 y que te muestre la suma 

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int total =0;//acumulador
        int contador = 0; //contador
        boolean bandera =false;
        
        while(bandera ==false){//se ejecuta hasta que supere el nun 100
            System.out.println("Introduce num: ");
            num = sc.nextInt();
            if(num==0){
                bandera = true;
            }else{
                contador++;
                total = total + num;
            }        
        }
        System.out.println("Has introducido " +contador+" num, la suma total es: "+total);          
    }
}
