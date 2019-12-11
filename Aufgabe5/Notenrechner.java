import java.util.Scanner;

class Notenrechner{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die maximal zu erreichende Punktzahl ein: ");
        int max = scanner.nextInt();

        System.out.println("Geben Sie die erreichten Punkte ein: ");
        int scored = scanner.nextInt();
        scanner.close();

        double percent = scored / max * 100;
        System.out.println(String.format("Prozent erreicht: %.0f", percent));
        System.out.println(String.format("Damit hat der Schüler die Note: %.0f erreicht.", getGrade(percent)));
    }

    private static double getGrade(double percent){
        if (percent >= 92) {
            return 1d;
        } else if (percent >= 81) {
            return 2d;
        } else if (percent >= 67) {
            return 3d;
        } else if (percent >= 50) {
            return 4d;
        } else if (percent >= 30) {
            return 5d;
        } else {
            return 6d;
        }
    }
}