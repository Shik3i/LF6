import java.util.Scanner;

class Taschenrechner{

    public static void main(String[] args){
        // Scanner initialisieren für die Console.Inputs
        Scanner scanner = new Scanner(System.in);

        // Erste Zahl abfragen
        System.out.println("Erste Zahl: ");
        // Kein Integer.TryParse() in Java und ich habe keine Lust jedes mal TryCatch Blöcke mit NumberFormatException zu bauen, also vertrauen wir mal dem Benutzer.
        int firstInt = scanner.nextInt();

        // Zweite Zahl abfragen
        System.out.println("Zweite Zahl: ");
        int secondInt = scanner.nextInt();

        // Operator abfragen
        System.out.println("Rechenoperator: ");
        String operator = scanner.next();

        // Resource leak prevention, ist Java nicht schön?
        scanner.close();

        // double, da bei division nicht nur Ganzzahlen entstehen
        double result = 0d;
        // die Operationen durchgehen, bei ungültigem Operator Fehlermeldung ausgeben und Programm abbrechen.
        switch (operator){
            case "+":
                result = firstInt + secondInt;
                break;
            case "-":
                result = firstInt - secondInt;
                break;
            case "*":
            case "x":
                result = firstInt * secondInt;
                break;
            case "/":
            case ":":
                // bei Division immer prüfen ob Nenner != 0
                if (secondInt == 0){
                    System.out.println("Durch 0 teilen ist nicht möglich, bitte versuchen Sie es mit einer Grenzwertfunktion.");
                    return;
                }
                result = firstInt / secondInt;
                break;
            default:
                System.out.println("Ungültiger Operator!");
                return;
        }

        // Vollständigen Term mit Ergebnis ausgeben
        System.out.println(firstInt + " " + operator + " " + secondInt + " = " + String.format("%.1f", result));
    }
}