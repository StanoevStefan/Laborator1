package exercitiul1;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dati lungimea:");
        int lungime=scanner.nextInt();
        System.out.print("Dati latimea:");
        int latime=scanner.nextInt();
        int perimetru=lungime+latime;
        System.out.println("Perimetrul este egal cu "+perimetru);
        int aria=lungime*latime;
        System.out.println("Aria este egala cu "+aria);
        scanner.close();


    }
}
