package unidad1;

public class ejercicio1_4 {
    final static int SEMANASMES = 4;
    public static void main(String[] args) {
         int cantidad = 1000;
        int cantidadRetiro = 200;
        int cantidadFinal = 1000 - (SEMANASMES*cantidadRetiro);

        System.out.println("Saldo inicial: " + cantidad);
        System.out.println("Saldo retirado por semana:" + cantidadRetiro);
        System.out.println( "Su cantidad al terminar el mes :" + cantidadFinal);
    }
    
}
