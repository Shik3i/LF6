import java.util.Scanner;

class Kapitalverzinsung{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Startkapital: ");
        // Muss nicht gespeichert werde, da Startkapital keine Rolle spielt für die Aufgabe, solange es positiv ist
        while (scanner.nextInt() <= 0){
            System.out.println("Ihr Startkapital muss positiv sein!");
            System.out.println("Startkapital: ");
        }

        System.out.println("Zinssatz: ");
        double interest = 0d;
        while ((interest = scanner.nextDouble()) <= 0){
            System.out.println("Ihr Zinssatz muss positiv sein!");
            System.out.println("Zinssatz: ");
        }
        scanner.close();

        long nsBefore1 = System.nanoTime();
        double money = 1;
        int years = 0;
        // da die Aufgabe die Überschrift "Schleifen" hat, gehe ich mal davon aus, das so etwas hier gemeint war
        while (money < 2){
            money *= 1 + interest / 100;
            years++;
        }
        long nsAfter1 = System.nanoTime();

        // Allerdings könnte man auch die Zinseszinsformel (Kn = K0 * (1 + p/100)^n) umstellen nach n = log(Kn) / log(1 + p/100).
        // Allerdings ist die berechnung des Logarithmusses so ineffizient, selbst in dieser Zeit des Niedrigszinses
        // Die meiste Zeit geht für das Math.ceil drauf, (int) +0.5 geht sehr sehr viel schneller (.32 ms schneller)
        long nsBefore2 = System.nanoTime(); 
        years = (int) (Math.log(2) / Math.log(1 + interest / 100) + 0.5);
        long nsAfter2 = System.nanoTime();

        System.out.println("Der eingesetzte Geldbetrag hat sich nach " + years + " Jahren verdoppelt.");
        System.out.println("Gewischwindigkeit Schleife: " + (nsAfter1 - nsBefore1) + " ns");
        System.out.println("Geschwidnigkeit Logarithmus: " + (nsAfter2 - nsBefore2) + " ns");

        // Zeiten
        // Zinssatz |   Zeit While  | Zeit Log    | DIFF
        //___________________________________________________
        // 1%       |   3.700 ns    | 65.600 ns   | -61.900 ns
        // 0,5%     |   5.600 ns    | 57.300 ns   | -51.700 ns
        // 0,1%     |   22.500 ns   | 63.400 ns   | -40.900 ns
        // 0,05%    |   54.600 ns   | 58.100 ns   | -3.500 ns
        // 0,04%    |   65.200 ns   | 57.100 ns   | 8.100 ns
        // 0,01%    |   268.900 ns  | 45.200 ns   | 223.700 ns
    }
}