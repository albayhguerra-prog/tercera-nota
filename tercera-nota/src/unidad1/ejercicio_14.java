package unidad1;

import java.util.Scanner;

public class ejercicio_14 {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
        System.out.println("Calcula la tabla de multiplicar del que desees");

        System.out.println("Ingrese el número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println( numero + "x" + i + "=" + (numero*i));
        }
    }
    
}
