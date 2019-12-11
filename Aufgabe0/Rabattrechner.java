import java.util.Scanner;

class Rabattrechner {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Bestellwert eingeben: ");
        double price = scanner.nextDouble();

        System.out.println("Handelt es sich um einen Angebotsartikel? 1 = Ja, 0 = Nein ");
        if (scanner.nextInt() == 1){
            price *= 0.9;
        }
        scanner.close();

        if (price >= 200){
            price *= 0.85;
        } else if (price < 20){
            price += 3.5;
        }

        System.out.println("Der endgültige Preis beläuft sich auf: " + String.format("%.2f €", price));
    }
}

