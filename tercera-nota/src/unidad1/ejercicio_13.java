package unidad1;

import java.util.Scanner;

public class ejercicio_13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero = sc.nextInt();

        int resultado = 1;
        int i = numero;

        while (i > 0) {
            resultado *= i;
            i--;
        }
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
    
}
