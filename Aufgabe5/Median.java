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

        // Sortieren mit bubblesort, zwar langsam(O(n²)) aber am einfachsten/schnellsten zu implementieren/erklären
        numbers = bubblesort(numbers);

        // für jede ungerade Anzahl an sortierten Zahlen "n" ist der Median immer bei n / 2
        System.out.println("Median: " + numbers[n / 2]);
    }

    private static int[] bubblesort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i; j++) {
				if (numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
        return numbers;
    }
}