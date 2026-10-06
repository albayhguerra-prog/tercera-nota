package unidad2;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio02_5 {

    static double aplicarDescuento(double precio, int porcentaje) {
        return precio - (precio * porcentaje / 100);
    }

    static boolean superaLimite(double precioFinal, double limite) {
        return precioFinal > limite;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Control de compra con descuento");
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        System.out.print("Descuento (%): ");
        int porcentaje = sc.nextInt();
        System.out.print("Su limite de presupuesto cual es: ");
        double limite = sc.nextDouble();

        double precioFinal = aplicarDescuento(precio, porcentaje);
        boolean limiteCompra = superaLimite(precioFinal, limite);

        System.out.println("Precio final: " + precioFinal);
        System.out.println("Te pasaste del limite: " + limiteCompra);

        sc.close();
    }
}