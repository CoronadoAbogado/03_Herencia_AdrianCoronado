package mainempresa;

public class EmpleadoTiempoCompleto extends Empleado {

    private int horasExtra;

    public EmpleadoTiempoCompleto(int horasExtra, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.horasExtra = horasExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    int calcularDineroTiempoCompleto() {

        salarioBase = salarioBase + (horasExtra * 9);
        return (int) salarioBase;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{"
                + "nombre='" + getNombre() + '\''
                + ", horas extra=" + horasExtra
                + ", salarioTotal=" + calcularDineroTiempoCompleto()
                + '}';
    }
}
