import java.util.Scanner;

class Blutalkohol{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie ihren Promillewert ein: ");
        double promille = 0d;
        while ((promille = scanner.nextDouble()) <= 0){
            System.out.println("Ihr Promillewert muss positiv sein!");
            System.out.println("Geben Sie ihren Promillewert ein: ");
        }

        System.out.println("Stunden: ");
        int hours = 0;
        while ((hours = scanner.nextInt()) < 1){
            System.out.println("Sie müssen mindestens für 1 STunde ausnüchtern!");
            System.out.println("Stunden: ");
        }

        for (int hour = 1; hour <= hours; hour++){
            System.out.println(String.format("%d. Stunde: %.3f", hour, promille *= 0.8));
        }

        scanner.close();
    }
}