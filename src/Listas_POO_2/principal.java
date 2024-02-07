
package Listas_POO_2;

import java.util.ArrayList;


public class principal {
    public static void main(String[] args) {
        
        Empleado listaEmpleado[] = new Empleado[3];
        
        listaEmpleado[0] = new Empleado("Ana",45,2500);
        listaEmpleado[1] = new Empleado("Antonio",55,2000);
        listaEmpleado[2] = new Empleado("María",25,2600);
       
        for(Empleado e: listaEmpleado){
            System.out.println(e.toString());
        }
        System.out.println("=========");
        System.out.println("ArrayList");
        ArrayList<Empleado> listaArrayList = new ArrayList<Empleado>();
        listaArrayList.add(new Empleado("Ana",45,2500));
        listaArrayList.add(new Empleado("Antonio",55,2000));
        listaArrayList.add(new Empleado("María",25,2600));
        listaArrayList.add(new Empleado("Jose",15,2600));
        listaArrayList.add(new Empleado("Pepe",35,2600));
        
        for(Empleado p:listaArrayList ){
            System.out.println(p.toString());
        }
    }
}
