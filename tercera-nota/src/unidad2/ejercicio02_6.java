package unidad2;
import java.util.Random;

public class ejercicio02_6 {
    static final int TAMAÑO = 10;
    public static void main(String[] args) {
        Random random = new Random();
    int[] vector_Numero = new int[TAMAÑO];

        for (int i = 0; i < TAMAÑO; i++) {
           vector_Numero[i] = random.nextInt(10) + 1;
    };

      for (int j = 0; j < TAMAÑO; j++) {
       int num = vector_Numero[j];
       int cuadrado = num * num;
       int cubo = cuadrado * num;

     System.out.println("Número aleatorio: " + num);
     System.out.println("Número al cuadrado: " + cuadrado);
     System.out.println("Número al cubo: " + cubo);
      }
    }
}
    

