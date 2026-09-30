package unidad1;

import java.util.Scanner;

public class ejercicio_12 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.println("Selecione su opcion segun el número que le corresponda a cada acción");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int opcion = sc.nextInt();

        System.out.println("Ingrese el primer número: ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma da como resultado: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("La resta da como resultado: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("La multiplicación da como resultado: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("La división da como resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("Número no válido");
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
    
}
