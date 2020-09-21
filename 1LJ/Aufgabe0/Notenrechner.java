import java.util.Scanner;

class Notenrechner{

    public static void main(String[] args){
        double result = 0d;
        if (args.length >= 1){
            int successfull = 0;
            for (int i = 0; i < args.length; i++){
                try { // Thanks java for not having a TryParse Method...
                    result += Double.parseDouble(args[i]);
                    successfull++;
                } catch (NumberFormatException e){
                    System.out.println("Argumente enthalten ungültige Zahlen!");
                }
            }
            result /= successfull;
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bitte die Deutschnote eingeben: ");
            result += scanner.nextInt();
            
            System.out.println("Bitte die Englischnote eingeben: ");
            result += scanner.nextInt();
            
            System.out.println("Bitte die Mathenote eingeben: ");
            result += scanner.nextInt();

            scanner.close();
            result /= 3;
        }

        System.out.println("Dein Notendurschnitt ist: " + String.format("%.1f", result));
        if (result >= 4.5){
            System.out.println("Du bist Durchgefallen!");
        } else {
            System.out.println("Du hast Bestanden!");
        }
    }
}