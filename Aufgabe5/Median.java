import java.util.Scanner;

class Median{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        int[] numbers = new int[3];

        // die 3 Zahlen eingeben lasssen und in das Array speichern
        for(int i = 1; i < n + 1; i++){
            System.out.println("Zahl " + i);
            numbers[i-1] = scanner.nextInt();
        }
        scanner.close();

        // für jede ungerade Anzahl an Zahlen "n" ist der Median immer bei n / 2
        System.out.println("Median: " + numbers[n / 2]);
    }
}