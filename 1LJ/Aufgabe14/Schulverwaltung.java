import java.util.Scanner;
import java.util.stream.*;

class Schulverwaltung {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anzahl Klassen: ");
        int n = scanner.nextInt();
        int[] pupils = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println(String.format("Anzahl der Schüler in Klasse %d: ", i + 1));
            pupils[i] = scanner.nextInt();
        }

        int sum = IntStream.of(pupils).sum();
        System.out.println(String.format("Die Gesamtzahl der Schüler beträgt: %d", sum));
        System.out.println(String.format("Durchschnittlich befinden sich %.1f Schüler in jeder Klasse.", sum / (double)n));

        scanner.close();
    }
}