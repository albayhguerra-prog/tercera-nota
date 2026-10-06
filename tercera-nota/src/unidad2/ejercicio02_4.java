package unidad2;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio02_4 {

    static double promedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    static boolean aprobo(double promedio) {
        return promedio >= 3.0;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); 

        System.out.println("Promedio de sus notas");

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();

        double prom = promedio(n1, n2, n3);
        boolean paso = aprobo(prom);

        System.out.println("Promedio: " + prom);
        System.out.println("Aprobo: " + paso);

        sc.close();
    }
}
