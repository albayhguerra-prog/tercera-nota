package unidad1;

public class ejercicio1_3 {
    public static void main(String[] args) {
        final double DESCUENTO_BASE = 0.15;
        final double DESCUENTO_ADICIONAL = 0.05;

        double precioCamiseta = 25;
        double precioPantalon = 30;

        double camisetaConDescuento = precioCamiseta * (1 - DESCUENTO_BASE);
        double pantalonConDescuento = precioPantalon * (1 - DESCUENTO_BASE);

        double totalSinSegundaCamiseta = camisetaConDescuento + pantalonConDescuento;

        double segundaCamiseta = camisetaConDescuento * (1 - DESCUENTO_ADICIONAL);

        double totalConSegundaCamiseta = totalSinSegundaCamiseta + segundaCamiseta;

        System.out.printf("Camiseta con descuento: $%.2f%n", camisetaConDescuento);
        System.out.printf("Pantalón con descuento: $%.2f%n", pantalonConDescuento);
        System.out.printf("Total (camiseta + pantalón): $%.2f%n", totalSinSegundaCamiseta);
        System.out.printf("Segunda camiseta (con descuento adicional): $%.2f%n", segundaCamiseta);
        System.out.printf("Total con segunda camiseta: $%.2f%n", totalConSegundaCamiseta);
    }
    
}
