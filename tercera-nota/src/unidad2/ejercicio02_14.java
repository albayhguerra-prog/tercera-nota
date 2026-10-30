package unidad2;

import java.util.Scanner;

public class ejercicio02_14 {
    static final int TEM_DIAS = 5;
    public static void main(String[] args) {
        double[] temp_Min = new double[TEM_DIAS];
        double[] tem_Max = new double[TEM_DIAS];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las temperaturas correspondiente aL día");
        for (int i = 0; i < TEM_DIAS; i++) {
            do {
                System.out.println("Día " + (i + 1) + " temperatura mínima: ");
                temp_Min[i] = sc.nextDouble();
                System.out.println("Día " + (i + 1) + " temperaruta máxima: ");
                tem_Max[i] = sc.nextDouble();
                if (temp_Min[i] > tem_Max[i]) {
                    System.out.println("La temperatura mínima no puede ser mayor que la máxima, vuelva a ingresarlo");
                }
            } while (temp_Min[i] > tem_Max[i]);
        }
        for (int i = 0; i < TEM_DIAS; i++) {
            double media = ( temp_Min[i] + tem_Max[i] )/ 2;
            System.out.println("La media del día " + (i + 1) + " es " + media);
        }

        double menor_Temp = temp_Min[0];
        for (int i = 0; i < TEM_DIAS; i++) {
            if (temp_Min[i] < menor_Temp) {
                menor_Temp = temp_Min[i];
            }
        }
        System.out.println("La temperatura menor en los 5 días es: " + menor_Temp);

        System.out.println("Ingrese una temperatura para saber si coincide con una de las máxima");
        double buscada_Tem = sc.nextDouble();
        boolean encontrada = false;
        for (int i = 0; i < TEM_DIAS; i++) {
            if (buscada_Tem == tem_Max[i]) {
                System.out.println("La temperatura máxima del día " + (i + 1) + " coincide con la temperatura ingresada que es " + buscada_Tem);
                encontrada = true;
            }
        }
        if (!encontrada) {
                System.out.println("No existe ninguna temperatura máxima que coincida");
    }

    }
}
