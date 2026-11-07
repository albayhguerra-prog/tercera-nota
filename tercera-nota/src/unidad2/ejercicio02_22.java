package unidad2;

import java.util.Scanner;

public class ejercicio02_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cant = leerCantidad(sc);
        int[] minutos = new int[cant];
        cargarEntregas(minutos, sc);
        int menor60 = rango(minutos, 10, 60);
        int minLong = minutos.length;
        int mayor60 = minLong - menor60;
        int suma = total(minutos);
        double promedio = promedio(minutos, suma);
        int mayorTiempo = mayorTiempo(minutos);

        mostraResultados(menor60, mayor60, suma, promedio, mayorTiempo);

        sc.close();
    }
    
    public static int leerCantidad(Scanner sc) {
        int cant = 0;
        do {
            System.out.println("Ingrese la cantidad de entregas durante la jornada: ");
            cant = sc.nextInt();
            if (cant <= 0) {
                System.out.println("Las entregas deben ser mayor que 0");
            }
        } while (cant <= 0);
        return cant;
    }

    public static boolean entregasValidas( int minutos) {
        return minutos >= 10 && minutos <= 120;
    }

    public static void cargarEntregas( int[] minutos, Scanner sc) {
        int minLong = minutos.length;
        for (int i = 0; i < minLong; i++) {
            do {
                System.out.println("Ingrese los minutos que se demoro en hacer la entrega " + (i + 1) + " :" );
                minutos[i] = sc.nextInt();
                if (!entregasValidas(minutos[i])) {
                    System.out.println("Minutos no válidos, vuelvalos a ingresar");
                }
            } while (!entregasValidas(minutos[i]));
        }
    }

    public static int rango(int[] minutos, int minimo, int maximo) {
        int contador = 0;
        int minLong = minutos.length;
        for (int i = 0; i < minLong; i++) {
            if (minutos[i] >= minimo && minutos[i] <= maximo) {
                contador++;
            }
        }
        return contador;
    }

    public static int total(int[] minutos) {
        int minLong = minutos.length;
        int suma = 0;
        for (int i = 0; i < minLong; i++) {
            suma += minutos[i];
        }
        return suma;
    }
    public static double promedio(int[ ] minutos, int suma) {
        return (double) suma / minutos.length;
     }

    public static int mayorTiempo(int[] minutos) {
        int minLong = minutos.length;
        int mayor = minutos[0]; 
        for (int i = 0; i < minLong; i++) {
            if (minutos[i] > mayor ) {
                mayor = minutos[i];
            }
        }
        return mayor;
    }

    public static void mostraResultados(int menor60, int mayor60, int suma, double promedio, int mayorTiempo) {
        System.out.println("La cantidad de entregas que tuvieron un tiempo entre 10 y 60 minutos: " + menor60);
        System.out.println("La cantidad de entregas que tuvieron un tiempo mayor a 60 minutos: " + mayor60);
        System.out.println("La suma de minutos de todas las entregas: " + suma);
        System.out.println("El promedio de las entregas: " + promedio);
        System.out.println("El mayor tiempo registrado es: " + mayorTiempo);
    }
}
