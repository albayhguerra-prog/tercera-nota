package unidad2;

public class ejercicio02_3 {
    public static void main(String[] args) {

        System.out.println("Sensor de Temperatura");

        int[] lecturas = {15, -99, 22, 30, -99, 45, 18, 25, -99, 40};
        
        double sumaValidas = 0;
        int cantidadValidas = 0;

        for (int temperatura : lecturas) {
            if (temperatura == -99) {
                continue;
            }

            sumaValidas += temperatura; 
            cantidadValidas++;          
        }

        if (cantidadValidas > 0) {
            double promedio = sumaValidas / cantidadValidas;
            System.out.println("Temperaturas validas promedio : " + promedio);
        } else {
            System.out.println("No hubo lecturas validas.");
        }
    }
    
}
