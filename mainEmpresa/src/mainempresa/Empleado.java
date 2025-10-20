package mainempresa;

public class Empleado {

    private String nombre;
    double salarioBase;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public Empleado() {
    }

    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salarioBase=" + salarioBase + '}';
    }

}
