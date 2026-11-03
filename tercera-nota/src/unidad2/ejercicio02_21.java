package unidad2;

import java.util.Scanner;

public class ejercicio02_21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int menor20000 = 0;
        int mayor20000 = 0;
        double total = 0;

        System.out.println("Ingrese la cantidad de vehículos que pagaron:");
        int cant = sc.nextInt();

        double[] pagos = new double[cant];
        for ( int i = 0; i < cant; i++) {
            do {
                System.out.println("Ingrese el pago del vehículo " + (i + 1) + ": ");
                pagos[i] = sc.nextDouble();
                if (pagos[i] < 2000 || pagos[i] > 50000) {
                    System.out.println("Pago no válido");
                }
            } while (pagos[i] < 2000 || pagos[i] > 50000);

            total += pagos[i];

            if (pagos[i] <= 20000) {
                menor20000++;
            } else {
                mayor20000++;
            }
        }

        System.out.println("La cantidad de pagos de los vehículos que estan entre $2000 y $20000: " +menor20000);
        System.out.println("La cantidad de pagos de los vehículos que son mayor que $20000: " +mayor20000);
        System.out.println("El total pagado es: " + total);

    }
}
