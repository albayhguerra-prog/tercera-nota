package unidad1;

import java.util.Scanner;

public class ejercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Suma de las diagonales de una matriz cuadrada");
        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = sc.nextInt();

        int[][] numeros = new int[n][n];
        System.out.println("Ingrese los valores para la " + numeros.length + "x" + numeros.length + " matriz: ");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                numeros[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz ingresada:");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;
        for (int i = 0; i < numeros.length; i++) {
            diagonalPrincipal += numeros[i][i];
            diagonalSecundaria += numeros[i][numeros.length - 1 - i];
        }
        System.out.println("Suma de la diagonal principal: " + diagonalPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + diagonalSecundaria);

    }
}