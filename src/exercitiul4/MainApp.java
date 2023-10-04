package exercitiul4;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();
        int numarGenerat = random.nextInt(21);

        System.out.println("Numarul generat: " + numarGenerat);

        if (esteInFibonacci(numarGenerat)) {
            System.out.println(numarGenerat + " face parte din șirul lui Fibonacci.");
        } else {
            System.out.println(numarGenerat + " nu face parte din șirul lui Fibonacci.");
        }
    }

    public static boolean esteInFibonacci(int numar) {
        if (numar < 0) {
            return false;
        }

        int fibonacci1 = 0;
        int fibonacci2 = 1;

        while (fibonacci2 < numar) {
            int temp = fibonacci2;
            fibonacci2 = fibonacci1 + fibonacci1;
            fibonacci1 = temp;
        }
        return fibonacci2 == numar;
    }
}
