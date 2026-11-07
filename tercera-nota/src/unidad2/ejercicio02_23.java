package unidad2;

import java.util.Scanner;

public class ejercicio02_23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cant = leerCantidad(sc);
        double[] temperaturas = new double[cant];
        cargarTemp(temperaturas, sc);
        int menor20 = rango(temperaturas, -10, 20);
        int tempLong = temperaturas.length; 
        int mayor20 =  tempLong - menor20;
        double suma = total(temperaturas);
        double promedio = promedio(temperaturas, suma);
        double mayorTemp = mayorTemp(temperaturas);
        double menorTemp = menorTemp(temperaturas);

        mostraResultados(menor20, mayor20, promedio, mayorTemp, menorTemp);

        sc.close();
    }
    
    public static int leerCantidad(Scanner sc) {
        int cant = 0;
        do {
            System.out.println("Ingrese la cantidad de temperaturas registradas: ");
            cant = sc.nextInt();
            if (cant <= 0) {
                System.out.println("La cantidad debe ser mayor que cero");
            }
        } while (cant <= 0);
        return cant;
    }

    public static boolean tempValida( double temperaturas) {
        return temperaturas >= -10 && temperaturas <= 45;
    }

    public static void cargarTemp( double[] temperaturas, Scanner sc) {
        int tempLong = temperaturas.length;
        for (int i = 0; i < tempLong; i++) {
            do {
                System.out.println("Ingrese la temperatura " + (i + 1) + " :");
                temperaturas[i] = sc.nextDouble();
                if (!tempValida(temperaturas[i])) {
                    System.out.println("Temperatura no válida");
                }
            } while (!tempValida(temperaturas[i]));
        }
    }

    public static int rango( double[] temperaturas, double minimo, double maximo) {
        int tempLong = temperaturas.length; 
        int contador = 0; 
        for (int i = 0; i < tempLong; i++) {
            if (temperaturas[i] >= minimo && temperaturas[i] <= maximo) {
                contador++;
            }
        }
        return contador;
    }

    public static double total(double[] temperaturas) {
         int tempLong = temperaturas.length; 
         double suma = 0;
        for (int i = 0; i < tempLong; i++) {
            suma += temperaturas[i];
        }
        return suma;
    }

    public static double promedio(double[] temperaturas, double suma ) {
        return suma / temperaturas.length;
    }

    public static double mayorTemp( double[] temperaturas) {
        int tempLong = temperaturas.length; 
        double mayor = temperaturas[0];
        for (int i = 0; i < tempLong; i++) {
            if (temperaturas[i] > mayor) {
                mayor = temperaturas[i];
            } 
        }
        return mayor;
    }

    public static double menorTemp( double[] temperaturas) {
        int tempLong = temperaturas.length; 
        double menor = temperaturas[0];
        for (int i = 0; i < tempLong; i++) {
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            } 
        }
        return menor;
    }

    public static void mostraResultados( int menor20, int mayor20, double promedio, double mayorTemp, double menorTemp) {
        System.out.println("Cantidad de temperaturas menores a 20: " + menor20);
        System.out.println("Cantidad de temperaturas mayores a 20: " + mayor20);
        System.out.println("Promedio de temperaturas: " + promedio);
        System.out.println("Temperatura mayor: " + mayorTemp);
        System.out.println("Temperatura menor: " + menorTemp);
    }
}
