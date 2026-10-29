package unidad2;

import java.util.Scanner;
public class ejercicio02_2 {
    public static void main(String[] args) {

        System.out.println("Intentos para ingresar a su cuenta");
        Scanner sc = new Scanner(System.in);
        String clave = "clavesecreta123";
        boolean accesoConcedido = false;

        for (int i = 0; i < 3; i++) {
            System.out.println("Intento " + (i + 1) + " Ingrese la contraseña");
            String ingreso = sc.nextLine();

            if (ingreso.equals(clave)) {
                System.out.println("Contraseña correcta, acceso concedido");
                accesoConcedido = true;
                break;
            } else {
                System.out.println("Contraseña incorrecta, acceso denegado");
            }
            
        }
        if (!accesoConcedido) {
            System.out.println("Cuenta bloqueada por una hora, intentos agotados");
            
        }
        sc.close();
    }
    
}
