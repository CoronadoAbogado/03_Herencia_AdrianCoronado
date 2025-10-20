package mainempresa;

public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private int tarifaPorHora;

    public EmpleadoPorHoras(int horasTrabajadas, int tarifaPorHora, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public int getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setTarifaPorHora(int tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    double DineroTotal;

    int calcularDineroPorHoras() {
        DineroTotal = salarioBase + (horasTrabajadas * tarifaPorHora);
        this.salarioBase = DineroTotal;
        return (int) salarioBase;

    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{"
                + "nombre='" + getNombre() + '\''
                + ", horasTrabajadas=" + horasTrabajadas
                + ", tarifaPorHora=" + tarifaPorHora
                + ", salarioTotal=" + calcularDineroPorHoras()
                + '}';
    }

}
