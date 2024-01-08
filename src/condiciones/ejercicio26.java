
package condiciones;

import java.util.Scanner;

/*
Escribe un programa que diga la nota del alumno dependiendo de su valor numérico:
<5 insuficiente
>=5 &&<6 suficiente
>=6 &&<7 bien
>=7 &&<9 notable
>=9 &&<10 sobresaliente
10:Matrícula de honor
*/

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese nota: ");
        int nota =0;
        nota = sc.nextInt();
        String valor="";
        
        if (nota < 5) {
           valor = "insuficiente";
        } else if (nota >= 5 && nota < 6) {
           valor = "suficiente";
        } else if (nota >= 6 && nota < 7) {
           valor = "bien";
        } else if (nota >= 7 && nota < 9) {
           valor = "notable";
        } else if (nota >= 9 && nota < 10) {
           valor = "sobresaliente";
        } else if(nota == 10){
            valor= "Matrícula de honor";
        }else{
            valor="Nota no válida";
        }
        System.out.println("Nota: "+ valor );
    }
}
