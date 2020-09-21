import java.util.Scanner;

class Kapitalverzinsung2{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kapital: ");
        double money = 0d;
        while ((money = scanner.nextDouble()) <= 0){
            System.out.println("Ihr Kapital muss positiv sein!");
            System.out.println("Kapital: ");
        }

        System.out.println("Zinssatz: ");
        double interest = 0d;
        while ((interest = scanner.nextDouble()) <= 0){
            System.out.println("Ihr Zinssatz muss positiv sein!");
            System.out.println("Zinssatz: ");
        }

        System.out.println("Jahre: ");
        int years = 0;
        while ((years = scanner.nextInt()) < 1){
            System.out.println("Sie müssen midnestens für 1 Jahr anlegen!");
            System.out.println("Jahre: ");
        }

        for (int year = 1; year <= years; year++){
            System.out.println(String.format("%d. Jahr: %.2f", year, money *= 1 + interest / 100));
        }

        scanner.close();
    }
}