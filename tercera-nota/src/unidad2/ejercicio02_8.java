package unidad2;

import java.util.Scanner;

public class ejercicio02_8 {
      static final int TAMAÑO = 5;
      static final int NOTA_MIN = 0;
      static final int NOTA_MAX = 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[TAMAÑO];

        for (int i = 0; i < TAMAÑO; i++) {   
            double nota_Alum;
            do {
                System.out.println("Ingrese nota " + (i + 1) + " (notas entre 0 y 10)");
                nota_Alum = sc.nextDouble();
                if (nota_Alum < NOTA_MIN || nota_Alum > NOTA_MAX) {
                    System.out.println("Nota no válida, vuelva a ingresarla");
                }
            } while (nota_Alum < NOTA_MIN || nota_Alum > NOTA_MAX);
                   notas[i] = nota_Alum;
    }

    double suma = 0;
    double nota_May = notas[0];
    double nota_Men = notas[0];

    for (int i = 0; i < TAMAÑO; i++) {
        suma += notas[i];
        if (notas[i] > nota_May) {
            nota_May = notas[i]; 
        }
        if (notas[i] < nota_Men) {
            nota_Men = notas[i];
        }
    }

    double media = suma / TAMAÑO;

    for (int i = 0; i < TAMAÑO; i++) {
        double n = notas[i];
        System.out.println("Nota " + (i + 1) + " del alumno es:" + n);
    }

    System.out.println("La media de las notas es: " + media);
    System.out.println("La nota más alta que ha sacado es: " + nota_May);
    System.out.println("La nota menor es. " + nota_Men);
    sc.close();
}
}
