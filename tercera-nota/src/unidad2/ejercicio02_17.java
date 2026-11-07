package unidad2;

import java.util.Scanner;

public class ejercicio02_17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cant = leerCantidad(sc);
        int[] edades = new int[cant];
        cargarEdades(sc, edades);
        int menor30 = rango(edades, 18, 30);
        int longEdades = edades.length;
        int mayor30 = longEdades - menor30;
        int total = total(edades);

        mostraResultados(menor30, mayor30, total);

        sc.close();
    }


public static int leerCantidad( Scanner sc) {
    int cant = 0;
    do {
        System.out.println("Ingrese la cantidad de perconas que ingresaron");
        cant = sc.nextInt();
        if (cant <= 0) {
            System.out.println("Cantidad no válida, debe ser mayor que cero");
        }
    } while (cant <= 0);
    return cant;
}
public static boolean edadValidas(int edades){
    return edades >= 18 && edades <= 50;
}
public static void cargarEdades(Scanner sc, int[] edades) {
    int longEdades = edades.length;
   for (int i = 0; i < longEdades; i++) {
     do {
         System.out.println("Ingrese la edad de la persona " + (i +1) + " :");
         edades[i] = sc.nextInt();
         if (!edadValidas(edades[i])) {
            System.out.println("Edad no válida");
         }
       } while (!edadValidas(edades[i]));
     }
}
public static int rango(int[] edades, int minimo, int maximo) {
    int contador = 0;
    int longEdades = edades.length;
    for (int i = 0; i < longEdades; i++) {
        if (edades[i] >= minimo && edades[i] <= maximo) {
            contador++;
        }
    }
    return contador;
}
public static int total(int[] edades) {
    int total = 0;
    int longEdades = edades.length;
    for (int i = 0; i < longEdades; i++) {
        total += edades[i]; 
    }
    return total;
}
public static void mostraResultados(int menor30, int mayor30, int total) {
    System.out.println("Las cantidad de personas que estan estre 18 y 30 años son: " + menor30);
    System.out.println("La cantidad de personas que son mayores de 30 son:" + mayor30);
    System.out.println("El total de las edades es: " + total);
}
}