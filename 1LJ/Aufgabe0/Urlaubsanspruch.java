import java.util.Scanner;

class Ulraubsanspruch{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr alter ein: ");
        int age = scanner.nextInt();       
        
        System.out.println("Bitte geben Sie Ihren Behinderungsgrad ein: ");
        int handycapLevel = scanner.nextInt();
        scanner.close();

        int vacation = 30;
        if ( age >= 52){
            vacation += 2;
        } else if (age < 18){
            vacation += 5;
        }

        if (handycapLevel >= 50){
            vacation += 5;
        }

        System.out.println("Ihr Uralubsanspruch beträgt: " + vacation + " Tage.");
    }
}