
package procedimientoFunciones;

import java.util.Scanner;

/*Define un procedimiento que reciba las caracteristicas de una fecha y muestre dicha fecha en consola
Entradas 'J', 12, 1, 2023
Salida: "Jueves, 12 de enero de 2023"
*/

public class ejercicio4 {
    public static void main(String[] args) {
        
        String dia_semana;
        int dia, mes, anno;
        
        Scanner sc = new Scanner(System.in);               
        System.out.println("Introduce un día de la semana ");
        dia_semana = sc.nextLine();
        System.out.println("Introduce un día ");
        dia = sc.nextInt();
        System.out.println("Introduce un mes ");
        mes = sc.nextInt();
        System.out.println("Introduce un año ");
        anno = sc.nextInt();
        
        fechas(dia_semana,dia,mes,anno);
    }
    
    public static void fechas(String d_s, int d,int m,int a){
       String dia_semana = "";
        
        switch(d_s){
            case "L": 
                dia_semana = "Lunes";
                break;
            case "M": 
                dia_semana = "Martes";
                break;
            case "X": 
                dia_semana = "Miércoles";
                break;
            case "J": 
                dia_semana = "Jueves";
                break;
            case "V": 
                dia_semana = "Viernes";
                break;
            case "S": 
                dia_semana = "Sábado";
                break;
            case "D": 
                dia_semana = "Domingo";
                break;
            default:
                dia_semana = "Día no válido";
                return;
        }
        
       String dia_mes = "";

        switch(m){
            case 1: 
                dia_mes = "Enero";
                break;
            case 2: 
                dia_mes = "Febrero";
                break;
            case 3: 
                dia_mes = "Marzo";
                break;
            case 4: 
                dia_mes = "Abril";
                break;
            case 5: 
                dia_mes = "Mayo";
                break;
            case 6: 
                dia_mes = "Junio";
                break;
            case 7: 
                dia_mes = "Julio";
                break;
            case 8: 
                dia_mes = "Agosto";
                break;
            case 9: 
                dia_mes = "Septiembre";
                break;
            case 10: 
                dia_mes = "Octubre";
                break;
            case 11: 
                dia_mes = "Noviembre";
                break;
            case 12: 
                dia_mes = "Diciembre";
                break;
            default:
                System.out.println("Mes no válido");
                return;
        }
        System.out.println(dia_semana + ", " + d + " de " + dia_mes + " de " + a);
    }
}
