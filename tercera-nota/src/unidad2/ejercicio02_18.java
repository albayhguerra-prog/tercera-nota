package unidad2;

import java.util.Scanner;

public class ejercicio02_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cant = leerCantidad(sc);
        double[] notas = new double[cant]; 
        cargarnotas(sc, notas);
        int menor3 = desaprobados(notas);
        int menor4 = rango(notas, 3.0, 4.0);
        int notasLong = notas.length;
        int mayor4 = notasLong - menor4 - menor3;
        double total = totalNotas(notas);
        
        mostraResultados(menor4, menor3, mayor4, total);

        sc.close();
    }
    
    public static int leerCantidad(Scanner sc) {
        int cant = 0;
        do {
              System.out.println("Ingrese la cantidad de los estudiantes");
            cant = sc.nextInt();
            if (cant <= 0) {
                System.out.println("La cantidad debe ser mayor a cero");
            }
        } while (cant <= 0);
      return cant;
    }

    public static boolean notasValidas( double notas) {
        return notas >= 0 && notas <= 5.0;
    }

    public static void cargarnotas( Scanner sc, double[] notas) {
        int notasLong = notas.length;
        for (int i = 0; i < notasLong; i++) {
            do {
                System.out.println("Ingrese las notas del estudiante " + (i + 1) + " :");
                notas[i] = sc.nextDouble();
                if (!notasValidas(notas[i])) {
                    System.out.println("Nota no válida, vuelva a ingresarla");
                }
            } while (!notasValidas(notas[i]));
        }
    }
    
    public static int desaprobados( double[] notas) {
        int notasLong = notas.length;
        int contador = 0;
        for (int i = 0; i < notasLong; i++) {
            if (notas[i] < 3.0) {
                contador++;
            }
        }
        return contador;
    }

    public static int rango( double[] notas, double minimo, double maximo ) {
        int contador = 0;
        int notasLong = notas.length;
        for (int i = 0; i < notasLong; i++) {
            if (notas[i] >= minimo && notas[i] <= maximo) {
                contador++;
            }
        }
        return contador;
    }

    public static double totalNotas( double[] notas ) {
        double total = 0;
        int notasLong = notas.length;
        for (int i = 0; i < notasLong; i++) {
            total += notas[i];
        }
        return total;
    }

    public static void mostraResultados( int menor4, int menor3, int mayor4, double total) {
        System.out.println("La cantidad de estudiante que tienen notas entre 3.0 y 4.0: " + menor4);
        System.out.println("Cantidad que desaprobaron: " + menor3);
        System.out.println("La cantidad de estudiantes que tienen notas por encima de 4.0: " + mayor4);
        System.out.println("La suma total de las notas del curso es: " + total);
    }
}
