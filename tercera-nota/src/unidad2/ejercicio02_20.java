package unidad2;

import java.util.Scanner;

public class ejercicio02_20 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int cant = leerCantidad(sc);
        int[] kilometros = new int[cant];
        cargarklm(sc, kilometros);
        int menor300 = rango(kilometros, 10, 300);
        int klmLongitud = kilometros.length;
        int mayor300 = klmLongitud - menor300;
        int suma = total(kilometros);
        
        mostraResultados(menor300, mayor300, suma);

        sc.close();
    }

    public static int leerCantidad( Scanner sc) {
        int cant = 0;
        do {
            System.out.println("Ingrese la cantidad de vehículos:");
            cant = sc.nextInt();
            if (cant <= 0) {
                System.out.println("Cantidad no válida, vuelvalo a ingresarla");
            }
        } while (cant <= 0);
        return cant;
    }

    public static boolean klmValidos( int kilometros) {
        return kilometros >= 10 && kilometros <= 500;
    }

    public static void cargarklm( Scanner sc, int[] kilometros) {
        int klmLongitud = kilometros.length;
        for (int i = 0; i < klmLongitud; i++) {
            do {
                System.out.println("Ingrese los kilometros recorridos por el auto " + (i + 1) + " :");
                kilometros[i] = sc.nextInt();
                if (!klmValidos(kilometros[i])) {
                    System.out.println("Valor no válido, ingreselo de nuevo");
                }
            } while (!klmValidos(kilometros[i]));
        }
    }

    public static int rango( int[] kilometros, int minimo, int maximo) {
        int contador = 0;
        int klmLongitud =kilometros.length;
        for (int i = 0; i < klmLongitud; i++) {
            if (kilometros[i] >= minimo && kilometros[i] <= maximo) {
               contador++; 
            }
        }
        return contador;
    }

    public static int total(int[] kilometros) {
        int suma = 0;
        int klmLongitud =kilometros.length;
        for (int i = 0; i < kilometros.length; i++) {
            suma += kilometros[i];
        }
        return suma;
    }

    public static void mostraResultados( int menor300, int mayor300, int suma) {
        System.out.println("La cantidad de vehículos con kilometros recorridos entre 10 y 300 km son: " + menor300);
        System.out.println("La cantidad de vehículos con kilometrosrecorridos mayor que 300 son: " + mayor300);
        System.out.println("La suma de kilometros recorridos de todos los vehículos es: " + suma);
    }
}
