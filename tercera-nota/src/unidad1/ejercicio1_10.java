package unidad1;

import java.util.Scanner;

public class ejercicio1_10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

  System.out.println("Ingrese un número: ");
        int numero1 = sc.nextInt();
         System.out.println("Ingrese un segundo número: ");
        int numero2 = sc.nextInt();
         System.out.println("Ingrese un tercer número: ");
        int numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El primer número es el mayor: " + numero1);
        }
        else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("El segundo número es el mayor: " + numero2);
        }
        else {
            System.out.println("El tercer número es el mayor: " + numero3);
        }
    }    
}
