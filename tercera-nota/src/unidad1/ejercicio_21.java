package unidad1;

import java.util.Scanner;

public class ejercicio_21 {
    public static void main(String[] args) {
        //conversor a binario leyendo el numero desde el teclado

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numero = sc.nextInt();

        do {
            System.out.println("Ingrese un número positivo: ");
            numero = sc.nextInt();
             if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
        }
        } while (numero <= 0);

        int[] binario = new int[32];
        int i = 0;

        while (numero > 0) {
            binario[i] = numero % 2;
            numero /= 2;
            i++;
        }       

        System.out.print("El número en binario es: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binario[j]);
        }

        System.out.println();
       

    }
    
}
