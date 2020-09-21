import java.util.Scanner;

class Noten{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die Note ein <1-6>:");
        int grade = scanner.nextInt();
        scanner.close();

        String gradeText = "Fehlerhafte Eingabe!";
        switch(grade){
            case 6:
                gradeText = "mangelhaft";
                break;
            case 5:
                gradeText = "ungenügend";
                break;
            case 4:
                gradeText = "ausreichend";
                break;
            case 3:
                gradeText = "befriedigend";
                break;
            case 2:
                gradeText = "gut";
                break;
            case 1:
                gradeText = "sehr gut";
                break;
        }
        System.out.println(gradeText);
    }
}