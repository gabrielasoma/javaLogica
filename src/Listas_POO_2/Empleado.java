

package Listas_POO_2;

public class Empleado {
    private String nombre;
    private Integer edad;
    private Integer salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }


    public Empleado() {
    }

    public Empleado(String nombre, Integer edad, Integer salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }    
          
}
