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

        int[] arr = {1, 520, 24, 5, 14, 81, 6};
        double avg = calculateAverage(arr);
        int max = calculateMax(arr);
        int min = calculateMin(arr);

        System.out.println("Średnia tablicy to: " + avg);
        System.out.println("Minimalna wartość tablicy to: " + min);
        System.out.println("Maksymalna wartość tablicy to: " + max);
    }


    public static double calculateAverage(int[] values) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }

        double avg = sum / values.length;
        return avg;
    }

    public static int calculateMax(int[] values) {
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        
        return max;
    }

    public static int calculateMin(int[] values){
<<<<<<< HEAD

        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;

=======
        int min = values[0];
>>>>>>> fec11b7 (zadeklarowanie domyślnej minimalnej wartości)
        return val;
    }
}