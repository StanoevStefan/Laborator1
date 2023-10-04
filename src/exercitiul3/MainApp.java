package exercitiul3;
import java.util.Random;
public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();
        int numar1 = random.nextInt(30) + 1;
        int numar2 = random.nextInt(30) + 1;

        System.out.println("Numarul 1: " + numar1);
        System.out.println("Numarul 2: " + numar2);

        int cmmdc = calculCMMDc(numar1, numar2);

        System.out.println("Cel mai mare divizor comun (CMMDc): " + cmmdc);
    }
    public static int calculCMMDc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
