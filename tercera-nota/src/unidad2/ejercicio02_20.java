package unidad2;

import java.util.Scanner;

public class ejercicio02_20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int menor300 = 0;
        int mayor300 = 0;
        int total_Klm = 0;

        System.out.println("Ingrese la cantidad de vehículos: ");
        int cant_Veh = sc.nextInt();

        int[] kilometros = new int[cant_Veh];

        for (int i = 0; i < cant_Veh; i++) {
            do {
                System.out.println("Ingrese los kilometros recorridos por el vehículo " + (i +1) + " : ");
                kilometros[i] = sc.nextInt();
                if (kilometros[i] < 10 || kilometros[i] > 500) {
                    System.out.println("kilometros no válidos");
                }
            } while (kilometros[i] < 10 || kilometros[i] > 500);

            total_Klm += kilometros[i];

            if (kilometros[i] <= 300) {
                menor300++;
            } else {
                mayor300++;
            }
        }
        System.out.println("Cantidad de vehículos que recorrieron etre 10 km y 300 km: " + menor300);
        System.out.println("Cantidad de vehículos que recorrieron más de 300 km: " + mayor300);
        System.out.println("Total de kilometros: " + total_Klm);
    }
}
