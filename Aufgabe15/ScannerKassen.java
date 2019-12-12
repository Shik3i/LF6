import java.util.Scanner;

class ScannerKassen{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anzahl der gekauften Scannerkassen: ");
        int count = scanner.nextInt();

        System.out.println("Einzelpreis: ");
        double price = scanner.nextDouble();

        System.out.println("Kundenkategorie <1, 2, 3, 4 für keine>");
        int category = scanner.nextInt();
        scanner.close();

        double totalPrice = price * count;
        double discount = 0d;
        String discountText = "0%";

        switch (category){
            case 1:
                discount = totalPrice * 0.1;
                discountText = "10%";
                break;
            case 2:
                discount = totalPrice * 0.12;
                discountText = "12%";
                break;
            case 3:
                discount = totalPrice * 0.2;
                discountText = "20%";
                break;
        }

        System.out.println(String.format("\nAnzahl: " + count));
        System.out.println(String.format("Einzelpreis: %.2f", price));
        System.out.println(String.format("Kundenkategorie: " + (category >= 4 ? " keine" : category)));
        System.out.println(String.format("Rabattsatz: %s", discountText));
        System.out.println(String.format("Rabattbetrag: %.2f€", discount));
        System.out.println(String.format("Gesamtpreis: %.2f€", totalPrice - discount));
    }
}