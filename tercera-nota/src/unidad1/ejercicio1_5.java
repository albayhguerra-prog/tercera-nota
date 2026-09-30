package unidad1;
import java.util.Scanner;

public class ejercicio1_5 {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese su altura: ");
        double altura = sc.nextDouble();

        System.out.println("Tu nombre es " + nombre + " con edad " + edad + " y altura " + altura);
}

}