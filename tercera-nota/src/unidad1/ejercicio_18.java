package unidad1;

public class ejercicio_18 {
    public static void main(String[] args) {

        
        int[][] matriz = {
            {5, 8, 11},
            {9, 15, 0},
            {4, 12, 7}
        }; 

        int[][] traspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz original:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz traspuesta:");
        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < traspuesta[0].length; j++) {
                System.out.print(traspuesta[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
