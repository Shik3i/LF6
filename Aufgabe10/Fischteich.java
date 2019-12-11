import java.util.Scanner;

class Fischteich{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die Anzahl der Fische im Teich ein: ");
        double fish = scanner.nextInt();

        System.out.println("Geben Sie die Anzahl der Fische ein, die jede Woche hinzukommen: ");
        int newcomers = scanner.nextInt();

        System.out.println("Endwert: ");
        int goal = scanner.nextInt();
        scanner.close();

        int weeks = 0;
        while (fish >= goal){
            // Laut dem Beispielbild erst 22% abziehen, dann die neuen Fische dazu adddieren.
            System.out.println(String.format("Woche %d: %.0f", ++weeks, fish = fish * 0.78 +  newcomers));
        }
    }
}