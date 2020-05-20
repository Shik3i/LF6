import java.util.Scanner;

class DateCheck{


    public static void main(String[] args){
        int[] daysInMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Tag eingeben: ");
        int day = scanner.nextInt();

        System.out.println("Bitte Monat eingeben: ");
        int month = scanner.nextInt();

        // Das Jahr sollte immer valid sein
        System.out.println("Bitte Jahr eingeben: ");
        int year = scanner.nextInt();
        scanner.close();

        boolean isValid = true;
        // Schaltjahr prüfung
        if (year % 4 == 0
            && (!(year % 100 == 0)
                || year % 400 == 0)) {
                    daysInMonth[1] += 1;
        }

        // Monat prüfen
        if (month < 1
            || month > 12) {
                isValid = false;
        }

        // Tag überprüfen
        if (isValid
            && (day < 1
                || day > daysInMonth[month - 1])) {
                    isValid = false;
        }

        if (isValid) {
            System.out.println("Das Datum ist richtig!");
        } else {
            System.out.println("Das Datum ist falsch!");
        }
    }
}