import java.util.Scanner;

class Maximum {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Bitte geben Sie Ihre nächste Zahl ein: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Die höchste Zahl ist: " + getMaximumNumberFromArray(numbers));
    }

    private static int getMaximumNumberFromArray(int[] numbers) {
        int max = Integer.MIN_VALUE;

        for (int i : numbers) {
            if (i > max){
                max = i;
            }
        }

        return max;
    }
}