package unidad2;

import java.util.Scanner;

public class ejercicio02_15 {
    static final int FILAS = 5;
    static final int COLUMNAS = 5;
    public static void main(String[] args) {
        int[][] matriz = new int[FILAS][COLUMNAS];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.println("Ingrese números enteros para llenar la matriz. Fila: " + (i + 1) + " Columnas: " + (j + 1));
                matriz[i][j] = sc.nextInt();
            }
            
        }
        for (int i = 0; i < FILAS; i++) {
            int suma_Filas = 0;
            for (int j = 0; j < COLUMNAS; j++) {
                suma_Filas += matriz[i][j];
            }
            System.out.println("El resultado al sumar la filas " + (i + 1) + " es: " + suma_Filas);
    
        }
        for (int i = 0; i < COLUMNAS; i++) {
            int suma_Columnas = 0;
            for (int j = 0; j < FILAS; j++) {
                suma_Columnas += matriz[i][j];
                
            }
            System.out.println("El resultado al sumar la Columnas " + (i + 1) +  " es: " + suma_Columnas);

        }
    }
}

