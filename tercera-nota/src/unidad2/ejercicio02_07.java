package unidad2;

import java.util.Scanner;

public class ejercicio02_07 {
    static final int TAMAÑO = 5;
    public static void main(String[] args) {
        String[] vector_Caracteres = new String[TAMAÑO];
        String[] vector_Contrario = new String[TAMAÑO];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < TAMAÑO; i++) {
            System.out.println("Ingrese la palabra " + (i+1));
            vector_Caracteres[i] = sc.nextLine();
        }

        for (int i = 0; i < TAMAÑO; i++) {
            vector_Contrario[i] = vector_Caracteres[TAMAÑO -1 -i ];
        }

        for (int i = 0; i < TAMAÑO; i++) {
            System.out.println("Vector original: " + vector_Caracteres[i]);
        }

        for (int i = 0; i < TAMAÑO; i++) {
            System.out.println("Vector contrario o inverso: " + vector_Contrario[i]);
            
        }
        sc.close();
    }
    
}
