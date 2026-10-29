package unidad2;

import java.util.Scanner;

public class ejercicio02_11 {
    static  final int TAMAÑO_MES = 12;
    public static void main(String[] args) {
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        int num_Mes = 0;

        System.out.print("Meses: 1. Enero 2. Febrero 3. Marzo 4. Abril 5. Mayo 6. Junio 7. Julio 8. Agosto 9. Septiembre 10. Octubre 11. Noviembre 12. Diciembre");
    do {
        System.out.println("Ingrese un número correspondiente a un mes del año");
        num_Mes = sc.nextInt();
        if (num_Mes < 0 || num_Mes > TAMAÑO_MES) {
            System.out.println("No corresponde a un número del mes");
        }
    } while (num_Mes < 0 || num_Mes > TAMAÑO_MES);
   
    String nombre_Mes = mes[num_Mes - 1];
    int cantidad_Dias = dias[num_Mes - 1];

    System.out.println("El mes de " + nombre_Mes + " tiene " + cantidad_Dias + " días.");
    sc.close();
    }
}

