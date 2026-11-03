package unidad2;

import java.util.Scanner;

public class ejercicio02_19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int gasto_Menor100 = 0;
        int gasto_Mayor100 = 0;
        double total = 0;

        System.out.println("Ingrese la cantidad de clientes atendidos");
        int clientes = sc.nextInt();

        double[] gasto = new double[clientes];
        for (int i = 0; i < clientes; i++) {
            do {
                System.out.println("Ingrese el gasto del cliente " + (i + 1) + " : ");
                gasto[i] = sc.nextDouble();
                if (gasto[i] < 20000 || gasto[i] > 200000) {
                    System.out.println("Gasto no válido, intente de nuevo");
                }
            } while (gasto[i] < 20000 || gasto[i] > 200000);
            total += gasto[i];

            if (gasto[i] >= 20000 && gasto[i] <= 100000) {
                gasto_Menor100++;
            } else {
                gasto_Mayor100++;
            }
        }

        System.out.println("Cantidad de clientes con gasto entre $20.000 y $100.000: " + gasto_Menor100);
        System.out.println("Cantidad de clientes con gasto mayor de $100.000: " + gasto_Mayor100);
        System.out.println("Total recibido por el restaurante es $" + total);

        sc.close();

    }
}
