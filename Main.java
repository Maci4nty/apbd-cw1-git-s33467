import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try { 
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = a * b;

            if (sum > 0) {
                System.out.println("Iloczyn liczb jest dodatni, a wynik to " + sum);
            } else 
                System.out.println("Iloczyn liczb jest ujemny, a wynik to: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Nieprawidłowy typ danych");
        }

        sc.close();
    }
}