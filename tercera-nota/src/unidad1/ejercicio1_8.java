package unidad1;

public class ejercicio1_8 {
    public static void main(String[] args) {
        
         int a = 10;
        int b = 5;
        int c = 20;
    
        System.out.println("a > b && b < c: " + (a > b && b < c));
        System.out.println("a < b && b > c: " + (a < b && b > c));
        System.out.println("b > a || a < c: " + (b > a || a < c));
        System.out.println("b < a || a > c: " + (b < a || a > c));
        System.out.println("!c > b:" + !(c > b) );
        System.out.println("!c < b:" + !(c < b) );
    }
    
}
