import java.util.Scanner; 

class Meldeamt {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie Ihren Nachnamen ein: ");
        // Nachnamen müssen mit Großbuchstaben anfangen
        String name = toUpperFirst(scanner.next());
        while(!isLegal(name)){
            System.out.println("Bitte nur Buchstaben von a-Z eingeben.");
            System.out.println("Geben Sie Ihren Nachnamen ein: ");
            name = toUpperFirst(scanner.next());
        }
        scanner.close();

        System.out.println(getRoomNumberForName(name));  
    }

    // ich vermisse c#
    private static String toUpperFirst(String name){
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    // Check auf verbotene Zeichen (SOnderzeichen, Zahlen etc.) Alles außer die normalen 26 Buchstaben.
    private static boolean isLegal(String name){
        for(char c : name.toUpperCase().toCharArray()){
            if (c > 'Z'
                || c < 'A'){
                    return false;
            }
        }
        return true;
    }

    private static String getRoomNumberForName(String name){
        char firstLetter = name.charAt(0);
        String clerk = "";
        String roomNo = "";

        // Dank der anfänglichen Prüfung brauchen wir hier keine ands für die Bereiche
        if (firstLetter >= 'U'){
            clerk = "Frau Kahrs";
            roomNo = "105";
        } else if (firstLetter >= 'P'){
            clerk = "Herr Grün";
            roomNo = "104";
        } else if (firstLetter >= 'J'){
            clerk = "Frau Tunichgut";
            roomNo = "103";
        } else if (firstLetter >= 'F'){
            clerk = "Herr Müller";
            roomNo = "102";
        } else { // A-E
            clerk = "Frau Hoffenheim";
            roomNo = "101";
        }

        return "Ihr Berater ist " + clerk + ", Zimmer " + roomNo + ".";
    }




}