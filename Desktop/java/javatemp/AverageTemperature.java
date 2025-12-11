import java.util.Scanner;
import java.util.ArrayList;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n;
        do {
            System.out.print("Enter the number of days (must be > 0): ");
            n = scanner.nextInt();
        } while (n <= 0);

        double[] temps = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temps[i] = scanner.nextDouble();
            sum += temps[i];
        }

        double average = sum / n;

        int countAbove = 0;
        ArrayList<Integer> aboveDays = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (temps[i] > average) {
                countAbove++;
                aboveDays.add(i + 1); 
            }
        }

        System.out.printf("%n Average temperature: %.2f%n", average);
        System.out.println("Number of days above average: " + countAbove);

        if (countAbove > 0) {
            System.out.print("Days above average: ");
            for (int day : aboveDays) {
                System.out.print("Day " + day + " ");
            }
            System.out.println();
        } else {
            System.out.println("All days are at or below average.");
        }

        scanner.close();
    }
}

