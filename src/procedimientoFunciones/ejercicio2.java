
package procedimientoFunciones;

//funciones, obtener el doble
public class ejercicio2 {
    public static void main(String[] args) {
    int var = 5;
    double numero = doubleNum(var);
        System.out.println("Respuesta: "+  numero);
    }
   
    public static double doubleNum(double num){
        num = num * 2;
    return num;
    }
       
}
