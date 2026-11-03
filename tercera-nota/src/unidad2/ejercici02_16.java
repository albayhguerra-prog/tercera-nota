package unidad2;

import java.util.Scanner;

public class ejercici02_16 {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int cant_Sueldo300 = 0;
        int cant_Sueldosmayor = 0;
        double importe_Total = 0;
        System.out.println("Ingrese la cantidad de empleados:");
        int cant_Empleados = sc.nextInt();

        double[] sueldos = new double[cant_Empleados];

        for (int i = 0; i < cant_Empleados; i++) {
            do {
            System.out.println("Ingrese el sueldo del empleado " + ( i + 1) + " :");
            sueldos[i] = sc.nextDouble();
            if (sueldos[i] < 100 || sueldos[i] > 500) {
                System.out.println("Sueldo no válido, intente de nuevo");
            }
             } while (sueldos[i] < 100 || sueldos[i] > 500);
             importe_Total += sueldos[i];

              if (sueldos[i] >= 100 && sueldos[i] <= 300) {
            cant_Sueldo300++;

        } else {
            cant_Sueldosmayor++;
        }
        }

        System.out.println("Cantidad de empleados que cobran entre $100 y $300: " + cant_Sueldo300);
        System.out.println("Cantidad de empleados que cobran entre más de $300: " + cant_Sueldosmayor);
        System.out.println("Importe total de los sueldos es $" + importe_Total);
    
        sc.close();
    }
}

