package unidad2;

import java.util.Scanner;

public class ejercicio02_19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cant = leerCantidad(sc);
        double[] gastos = new double[cant];
        cargarGastos(gastos, sc);
        int menor100 = rango(gastos, 20000, 100000);
        int gastosLong = gastos.length;
        int mayor100 = gastosLong - menor100;
        double suma = totalGastos(gastos);

        mostraResultados(menor100, mayor100, suma);

        sc.close();

    }

    public static int leerCantidad(Scanner sc) {
        int cant = 0;
        do {
            System.out.println("Ingrese la cantidad de clientes atendidos: ");
            cant = sc.nextInt(); 
            if (cant <= 0) {
                System.out.println("Los clientes deben ser mayor que cero");
            }
        } while (cant <= 0);
        return cant;
    }
     
    public static boolean gastosValidos( double gastos) {
        return gastos >= 20000 && gastos <= 200000;
    }

    public static void cargarGastos( double[] gastos, Scanner sc) {
        int gastosLong = gastos.length;
        for (int i = 0; i < gastosLong; i++) {
            do {
                System.out.println("Ingrese el gasto del cliente " + (i + 1) + " :");
                gastos[i] = sc.nextDouble();
                if (!gastosValidos(gastos[i])) {
                    System.out.println("Gasto no válido");
                }
            } while (!gastosValidos(gastos[i]));
        }
    }

    public static int rango( double[] gastos, double minimo, double maximo) {
        int gastosLong = gastos.length;
        int contador = 0;
        for (int i = 0; i < gastosLong; i++) {
            if (gastos[i] >= minimo && gastos[i] <= maximo) {
                contador++;
            }
        }
        return contador;
    }

    public static double totalGastos( double[] gastos) {
        int gastosLong = gastos.length;
        double suma = 0;
        for (int i = 0; i < gastosLong; i++) {
            suma += gastos[i];
        }
        return suma;
    }

    public static void mostraResultados(int menor100, int mayor100, double suma) {
         System.out.println("Las cantidad de clientes con gastos entre $20000 y $100000: " + menor100);
         System.out.println("La cantidad de clientes con gastos mayores a $100000:" + mayor100);
         System.out.println("La suma de gastos da $: " + suma);
    }
}
