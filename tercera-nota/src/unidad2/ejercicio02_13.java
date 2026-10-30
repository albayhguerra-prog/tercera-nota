package unidad2;

import java.util.Scanner;

public class ejercicio02_13 {
    static final int MAX_ALUMNOS = 60;
    static final int MAYOR_EDAD = 18;
    static final String FIN = "*";

    public static void main(String[] args) {
        String[] nombres = new String[MAX_ALUMNOS];
        int[] edades = new int[MAX_ALUMNOS];
        Scanner sc = new Scanner(System.in);
        int cant = 0;
        String nombre;

        do {
            System.out.println("Ingrese el nombre del alumno " + (cant + 1) + " (" + FIN + " para terminar)");
            nombre = sc.nextLine();
            if (!nombre.equals(FIN)) {
                System.out.println("Ingrese la edad de " + nombre);
                edades[cant] = sc.nextInt();
                sc.nextLine(); 
                nombres[cant] = nombre;
                cant++;
            }
        } while (!nombre.equals(FIN) && cant < MAX_ALUMNOS);

        if (cant == 0) {
            System.out.println("No se ingreso ningún alumno.");
        } else {
            System.out.println("Alumnos mayores de edad:");
            for (int i = 0; i < cant; i++) {
                if (edades[i] >= MAYOR_EDAD) {
                    System.out.println(nombres[i] + " (" + edades[i] + " años)");
                }
            }

            int mayor_Edad = edades[0];
            for (int i = 1; i < cant; i++) {
                if (edades[i] > mayor_Edad) {
                    mayor_Edad = edades[i];
                }
            }

            System.out.println("Alumnos de mayor edad (" + mayor_Edad + " años):");
            for (int i = 0; i < cant; i++) {
                if (edades[i] == mayor_Edad) {
                    System.out.println(nombres[i]);
                }
            }
        }

        sc.close();
    }
}