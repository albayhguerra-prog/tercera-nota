package unidad1;

import java.util.Scanner;

public class ejercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número : ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        double promedio = (double) suma / 5;
        System.out.println("El promedio de los números es: " + promedio);
        
    }
    
}
