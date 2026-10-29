package unidad2;

import java.util.Scanner;

public class ejercicio02_12 {
    static  final int TAMAÑO = 5;
    public static void main(String[] args) {
        int[] vector1 = new int[TAMAÑO];
        int[] vector2 = new int[TAMAÑO];
        int[] vector3 = new int[TAMAÑO];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese valores para el Vector 1");
        for (int i = 0; i < TAMAÑO; i++) {
            System.out.println("Dato " + (i+1) + ": ");
            vector1[i] = sc.nextInt();
        }
        System.out.println("Ingrese valores para el Vector 2");
         for (int i = 0; i < TAMAÑO; i++) {
            System.out.println("Dato " + (i+1) + ": ");
            vector2[i] = sc.nextInt();
        }
        for (int i = 0; i < TAMAÑO; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }
        System.out.println("El vector 3 sera igual a la suma de los dos primeros vectores");
        for (int i = 0; i < TAMAÑO; i++) {
            System.out.println("Dato-" + ( i + 1) + "vector 1: " + vector1[i] + " + " + "vector 2: " + vector2[i] + " = " + vector3[i]);
        }
        sc.close();
    }
    
}
