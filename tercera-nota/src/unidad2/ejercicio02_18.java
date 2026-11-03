package unidad2;

import java.util.Scanner;

public class ejercicio02_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota_Aprobar = 0;
        int nota_Notamayor = 0;
        double suma_Notas = 0;
        int nota_Desaprobados = 0;

        System.out.println("Ingrese la cantidad de estudiantes: ");
        int cant_Estd = sc.nextInt();

        double[] notas = new double[cant_Estd];

        for (int i = 0; i < cant_Estd; i++) {
        do {
            System.out.println("Ingrese la nota del estudiante " + (i + 1) + " :");
            notas[i] = sc.nextDouble();
            if (notas[i] < 0.0 || notas[i] > 5.0) {
                System.out.println("Nota no válida, intente de nuevo");
            }
        } while (notas[i] < 0 || notas[i] > 5);

        suma_Notas += notas[i];
        if (notas[i] >= 3.0 && notas[i] <= 4.0) {
            nota_Aprobar++;
        } else if (notas[i] < 3.0 ){ 
            nota_Desaprobados++;
        } else {
            nota_Notamayor++;
        }
        }

        System.out.println("Estudiantes que aprobaron con notas entre 3.0 y 4.0: " + nota_Aprobar);
        System.out.println("Estudiantes que desaprobaron: " + nota_Desaprobados);
        System.out.println("Estudiantes que aprobaron con la nota mayor a 4.0: " + nota_Notamayor);
        System.out.println("Suma de las notas de curso es: " + suma_Notas);

        sc.close();
    }
}
