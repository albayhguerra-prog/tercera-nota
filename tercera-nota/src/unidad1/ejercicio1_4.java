package unidad1;

public class ejercicio1_4 {
    public static void main(String[] args) {
        final int SEMANAS_POR_MES = 4;

        double saldoInicial = 1000;
        double retiroSemanal = 200;

        double totalRetirado = retiroSemanal * SEMANAS_POR_MES;
        double saldoFinal = saldoInicial - totalRetirado;

        System.out.printf("Saldo inicial: $%.2f%n", saldoInicial);
        System.out.printf("Total retirado en el mes: $%.2f%n", totalRetirado);
        System.out.printf("Saldo final: $%.2f%n", saldoFinal);
    }
    
}
