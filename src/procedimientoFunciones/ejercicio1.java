
package procedimientoFunciones;
//procedimiento
//Saludo
public class ejercicio1 {
    public static void main(String[] args) {
    
       saludo();
       
       String nombre = "Carmen";
       int edad = 22;
       saludoNombre(nombre);
       saludoDatos(nombre,edad);
       saludoDatos("Pedro",20);
    }
    
    public static void saludo(){
        System.out.println("Hola");
    }
    
    public static void saludoNombre(String nombre){        
        System.out.println("Hola " + nombre);
    }
    
    public static void saludoDatos(String nombre, int edad){        
        System.out.println("Hola " + nombre + " tienes :" + edad + " años");
    }
}
