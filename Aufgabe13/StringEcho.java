import java.util.Scanner;

class StringEcho{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihren Namen ein: ");
        // scanner.next() würde nur bis zum whitespace lesen.....
        String fullName = scanner.nextLine(); 
        scanner.close();

        // string array aus den einzelnen durch " " getrennte zeichen erzeugen
        String[] parts = fullName.split(" ");

        String newName = "";
        System.out.println("length: " + parts.length);
        for (int i = 0; i < parts.length; i++){
            if (i == parts.length - 1){
                newName += parts[i].toUpperCase();
            }else{
                newName += parts[i] + " ";
            }
        }
        System.out.println(newName);
    }
}