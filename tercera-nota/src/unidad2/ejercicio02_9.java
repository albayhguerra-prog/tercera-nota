package unidad2;

import java.util.Scanner;

public class ejercicio02_9 {
    static final int TAMAÑO = 10;
    public static void main(String[] args) {
        int[] vector_Numeros = new int[TAMAÑO];
        Scanner sc = new Scanner(System.in);
        int cant = 0;
        int num;
        do {
            System.out.println("Ingrese el número " + (cant + 1));
            num = sc.nextInt();
          if (num >=0) {
            vector_Numeros[cant] = num;
            cant++;
          }
        } while (num >=0 && cant < TAMAÑO);

        for (int i = 0; i < cant; i++) {
            System.out.println("Números introducidos " + (i + 1) + " :" + vector_Numeros[i]);
        }
    }
}