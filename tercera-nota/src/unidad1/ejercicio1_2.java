package unidad1;
import java.util.Scanner;
public class ejercicio1_2 {
    public static void main(String[] args) {

        System.out.println("Bienvenido a la calculadora de alba");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        int numero2 = sc.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int mod = numero1 % numero2;

        System.out.println("Suma:" + suma);
        System.out.println("Resta:" + resta);
        System.out.println("Multiplicación:" + multiplicacion);
        System.out.println("División:" + division);
        System.out.println("Modulo:" + mod);



        
    }

}