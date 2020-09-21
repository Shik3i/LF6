import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Zahlenraten{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        do{
            int ran = ThreadLocalRandom.current().nextInt(1, 11);
            int guess = 0;
            System.out.println("Geben Sie eine Zahl zwischen 1 und 10 ein: ");
            while ((guess = scanner.nextInt()) != ran){
                if (guess > ran){
                    System.out.println("Zu hoch!");
                }else{
                    System.out.println("Zu niedrig!");
                }
                System.out.println("Geben Sie eine Zahl zwischen 1 und 10 ein: ");
            }
            System.out.println("Richtig! Möchten Sie noch eine Rudne spielen? j / n");
        }while(scanner.next().equals("j"));
        scanner.close();
    }
}