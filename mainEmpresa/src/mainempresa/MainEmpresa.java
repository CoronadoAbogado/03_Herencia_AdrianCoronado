package mainempresa;

import java.util.Scanner;

public class MainEmpresa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleado Empleados[] = new Empleado[6];
        Empleado E1 = new Empleado("Adrian", 1200);
        Empleado E2 = new Empleado("Bogdan", 1130);
        EmpleadoTiempoCompleto ETP1 = new EmpleadoTiempoCompleto(2, "Andres", 1158);
        EmpleadoTiempoCompleto ETP2 = new EmpleadoTiempoCompleto(1, "Robert", 1158);
        EmpleadoPorHoras EPH1 = new EmpleadoPorHoras(20, 13, "Jose Luis", 0);
        EmpleadoPorHoras EPH2 = new EmpleadoPorHoras(21, 7, "Jose Luis", 0);
        Empleados[0] = E1;
        Empleados[1] = E2;
        Empleados[2] = ETP1;
        Empleados[3] = ETP2;
        Empleados[4] = EPH1;
        Empleados[5] = EPH2;
        System.out.println(E1);
        System.out.println(E2);
        System.out.println(ETP1);
        System.out.println(ETP2);
        System.out.println(EPH1);
        System.out.println(EPH2);
    }

}
