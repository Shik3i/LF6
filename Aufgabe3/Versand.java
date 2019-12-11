import java.util.Scanner;

class Versand{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double verpackung = 0d;
        double porto = 0d;

        // Auftragshöhe abhohlen
        System.out.println("Auftragshöhe: ");
        double contractVolume = scanner.nextDouble();
        scanner.close();

        // Je nach höhe des Auftrags porto/verpackung berechnen
        if (contractVolume < 100){
            verpackung = 3d;
            porto = 2d;
        } else if (contractVolume < 200){
            verpackung = 2d;
        }

        System.out.println(String.format("Verpackungszuschlag: %.2f EUR", verpackung));
        System.out.println(String.format("Porto: %.2f EUR", porto));
        System.out.println(String.format("Endpreis: %.2f EUR", contractVolume + verpackung + porto));
    }
}