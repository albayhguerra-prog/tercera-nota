package unidad1;

import java.util.Scanner;

public class ejercicio1_6 {
    final static int NUMERO_DE_NUMEROS = 3;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        double numero1 = sc.nextDouble();
        System.out.println("Ingrese un segundo numero:");
        double numero2 = sc.nextDouble();    
        System.out.println("Ingrese un tercer numero:");
        double numero3 = sc.nextDouble();

        double media = (numero1 + numero2 + numero3)/NUMERO_DE_NUMEROS;
        System.out.printf("La media de los tres numeros es: %.2f%n", media);
    }
}
