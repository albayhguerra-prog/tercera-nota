package unidad1;

public class ejercicio_11 {
    public static void main(String[] args) {
        
        int numerosPares = 0;
        for (int i = 1; i<=100; i++) {
           if (i % 2 == 0) {
            numerosPares++;
           }
           System.out.println("En " + i + " hay esta cantidad de numeros pares: " + numerosPares);
        }
    }
    
}
