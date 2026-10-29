package unidad2;

import java.util.Scanner;

public class ejercicio02_13 {
    static final int alum_Max = 150;
    public static void main(String[] args) {

        String[] nombre_Alum = new String[alum_Max];
        int[] edad_Alum = new int[alum_Max];
        Scanner sc = new Scanner(System.in);
        int contador = 0; 

        System.out.println("Introduce los datos de los alumnos. Escribe (*) como nombre para terminar");

        while (contador < alum_Max) {
            System.out.print("Nombre del alumno " + (contador + 1) + " : ");
            String nombre = sc.nextLine();
            if (nombre.equals("*")) {
                break;
            }
            System.out.print("Edad de " + nombre + ": ");
            int edad = sc.nextInt();
            sc.nextLine();
            nombre_Alum[contador] = nombre;
            edad_Alum[contador] = edad;
            contador++;
        }
        if (contador == 0) {
            System.out.println("No se han ingresado datos de los alumnos");
            sc.close();
            return;
        }
        System.out.println("Alumnos mayores de edad o más");
        boolean hayMayores = false;
        for (int i = 0; i < contador; i++) {
            if (edad_Alum[i] >= 18) {
                System.out.println("- " + nombre_Alum[i] + " (" + edad_Alum[i] + " años)");
                hayMayores = true;
            }
        }
        if (!hayMayores) {
            System.out.println("No hay alumnos mayores de edad.");
        }
        int edadMaxima = edad_Alum[0];
        for (int i = 1; i < contador; i++) {
            if (edad_Alum[i] > edadMaxima) {
                edadMaxima = edad_Alum[i];
            }
        }
        System.out.println("Alumnos con mayor edad " + edadMaxima + " años");
        for (int i = 0; i < contador; i++) {
            if (edad_Alum[i] == edadMaxima) {
                System.out.println(" " + nombre_Alum[i]);
            }
        }

        sc.close();
    }
    
}
