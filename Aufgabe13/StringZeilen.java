import java.util.Scanner;

class StringZeilen{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein Wort ein:");
        String word = scanner.next();
        scanner.close();

        for (char c : word.toCharArray()){
            System.out.println(c);
        }
    }
}