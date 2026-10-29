package unidad2;

import java.util.Arrays;
import java.util.Random;

public class ejercicio02_10 {
    static final int TAMAÑO = 20;
    public static void main(String[] args) {
        int[] vector_Aleatorios = new int[TAMAÑO];
        Random random = new Random();

        for (int i = 0; i < TAMAÑO; i++) {
            vector_Aleatorios[i] = random.nextInt(20) + 1;
        }

        for (int i = 0; i < TAMAÑO; i++) {
            System.out.println("Números aletoriamente: " + (i + 1) + ": " + vector_Aleatorios[i]);
        }
        Arrays.sort(vector_Aleatorios);
        for (int i = 0; i < TAMAÑO; i++) {
            System.out.println("Números ordenados de menor mayor: " + vector_Aleatorios[i]);
        }
    }
}
