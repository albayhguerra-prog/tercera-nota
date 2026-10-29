package unidad2;

import java.util.Scanner;

public class ejercicio02_1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Cajero Ahorrador");

    int totalGastos = 0;
    int mayoresGastos = 0;

    for (int i = 0; i < 5; i++) {
        System.out.println("Ingrese el dinero a gastar "+ (i + 1) + ": ");
        double gasto = sc.nextDouble();
        totalGastos += gasto;
        if (gasto > 50000) {
            mayoresGastos++;
        }
    }

    System.out.println("Gasto total:" + totalGastos);
    System.out.println("Mayores a 50 mil:" + mayoresGastos);

    sc.close();
    }
}