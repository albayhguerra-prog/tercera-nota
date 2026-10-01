package unidad1;

public class ejercicio_20 {
    public static void main(String[] args) {
         
    System.out.println("Multiplicación de matrices");
        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrizB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int[][] resultado = new int[matrizA.length][matrizB[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < matrizA[0].length; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("Matriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.print(matrizA[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Matriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Resultado de la multiplicación:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
