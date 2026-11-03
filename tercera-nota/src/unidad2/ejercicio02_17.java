package unidad2;

import java.util.Scanner;

public class ejercicio02_17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cant_Menor30 = 0;
        int cant_Mayor30 = 0;
        int suma_Edades = 0;
        
        System.out.println("Ingrese la cantidad de personas que ingresaron al evento:");
        int num_Pers = sc.nextInt();

        int[] Edades = new int[num_Pers];

        for (int i = 0; i < num_Pers; i++) {
            do {
            System.out.println("Ingrese la edad de la persona " + (i + 1) + " :");
            Edades[i] = sc.nextInt();
            if (Edades[i] < 18 || Edades[i] > 50) {
                System.out.println("Edad no válida");
            }
             } while (Edades[i] < 18 || Edades[i] > 50);
             
             suma_Edades += Edades[i];

             if (Edades[i] >= 18 && Edades[i] <= 30) {
                cant_Menor30++;
             } else {
                cant_Mayor30++;
             }
        }

        System.out.println("Cantidad de personas entre 18 y 30 años: " + cant_Menor30);
        System.out.println("Cantidad de personas mayor que 30 años: " + cant_Mayor30);
        System.out.println("La suma de edades de las personas ingresadas es : " + suma_Edades);

        sc.close();
    }
}
