
package Lista_POO_1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
         
        ArrayList<Persona> lista_personas = new ArrayList<>();
        
        Persona per  =new Persona();
        
        per.setCodigo(1);
        per.setNombre("Laura");
        per.setApellido("Martín");
        per.setEdad(21);
        
        
        System.out.println("Datos: " +per);
        
        lista_personas.add(per);
        System.out.println("ArrayList: "+ lista_personas);
        System.out.println("Datos lista: "+ lista_personas.get(0).getNombre() + " " + lista_personas.get(0).getApellido());
        
        //añadimos mas
        for (int i = 0; i < 5; i++) {
            
            Persona per1  =new Persona();

            per1.setCodigo(i);
            per1.setNombre("Maria" + i);
            per1.setApellido("Gomez" + i);
            per1.setEdad(30 +i);
            
            lista_personas.add(per1);
        }
        System.out.println("Tamaño de lista: "+lista_personas.size());
        
        //recorremos el arrayList
        for (Persona p: lista_personas) {
            System.out.println("Codigo: "+ p.getCodigo());
            System.out.println("Nombre: "+ p.getNombre());
            System.out.println("Apellido: "+ p.getApellido());
            System.out.println("Edad: "+ p.getEdad());
            System.out.println("----------------");
        }
        
    }
}
