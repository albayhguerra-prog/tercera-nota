package unidad1;

import java.util.Scanner;

public class ejercicio1_9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero1 = sc.nextInt();
         System.out.println("Ingrese un segundo número: ");
        int numero2 = sc.nextInt();
         System.out.println("Ingrese un tercer número: ");
        int numero3 = sc.nextInt();

        System.out.println("primer número > segundo número && primer número < tercer número: " + (numero1 > numero2 && numero1 < numero3) );
        System.out.println("primer número > segundo número || primer número < tercer número: " + (numero1 > numero2 || numero1 < numero3) );
        System.out.println("!primer número > segundo número: " + !(numero1>numero2) );
        System.out.println("!primer número < tercer número: " + !(numero1<numero3) );
    }
    
}
