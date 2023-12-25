
package javaejercicios;

import java.util.Scanner;

/*
Escribe un programa que calcule el salario neto de un trabajador en base al salario bruto
Las deducciones que se realizan son las siguientes
Impuestos: 12%
Cotizacion Social: 5%
Seguro Medico: 4.5%
En la consola se mostrara un mensaje en el que se muestren todas las deducciones y el salario bruto y neto

*/

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        double salBruto =0;
        double impuesto;
        double CS;
        double SM;
        double salNeto =0;
        double deducciones =0;
        
        
        System.out.println("Introduce salario bruto:");
        salBruto= sc.nextDouble();
        
        
        impuesto = salBruto * 0.12;
        CS = salBruto * 0.05;
        SM = salBruto * 0.045;
        deducciones  = impuesto + CS + SM;
        salNeto = salBruto - deducciones;
        
        System.out.println("Salario neto: " + salNeto);
    
        
    }
}
