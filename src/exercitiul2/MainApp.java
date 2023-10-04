package exercitiul2;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar natural: ");
        int n = scanner.nextInt();
        System.out.println("Divizorii lui " + n + " sunt:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != 1 && i != n) {
                    System.out.println("\n" + n + " nu este prim.");
                    return;
                }
            }
        }
        System.out.println("\n" + n + " este prim.");
    }}
