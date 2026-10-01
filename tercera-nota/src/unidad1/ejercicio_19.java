package unidad1;

import java.util.Scanner;

public class ejercicio_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Identificar si es una palabra palíndroma");
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.next().toLowerCase();

        boolean esPalindromo = true;
        int longitud = palabra.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra es palíndroma.");
        } else {
            System.out.println("La palabra no es palíndroma.");
        }
    }
}
