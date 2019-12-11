import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

class Rechteck{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // List statt Array da wir nicht wissen wieviele Elemente wir haben, und jedes mal neu Initialisieren unnötig resourcen verbraucht.
        // Leider können wir bei Java keine List von eigenen Typen initialisieren, also müssen wir ArrayList oder linkedList benutzen, LinkedList sollte in diesem Fall bessere Perfomance haben.
        // Da wir nur adds ausführen und am ende über einen iterator auf die einzelnen elemente zugreifen. Bei vielen unsortierten schreib/lesevorgängen wäre Arraylist jedoch perfomanter.
        List<Rectangle> rectangles = new LinkedList<Rectangle>();

        boolean finished = false;
        while (!finished) {
            // Längen abfragen
            System.out.println("Länge Seite A: ");
            int a = scanner.nextInt();

            System.out.println("Länge Seite B: ");
            int b = scanner.nextInt();

            // neues Rechteck in der Liste der bisherigen Rechtecke speichern.
            rectangles.add(new Rectangle(a, b));

            System.out.println("Möchten Sie weitere Rechtecke eingeben? j = ja, n = nein");
            finished = scanner.next().toLowerCase().equals("n");
        }

        System.out.println("Was soll Berechnet werden? [1] Fläche, [2] Umfang, [3] Diagonale; [4] Alles ");
        int mode = scanner.nextInt();
        scanner.close();

        // Zähler zur Benennung der Rechtecke
        int i = 0;
        // Alle Rechtecke durchgehen und Ihre Seitenlängen, Fläche, Umfang, Diagonale ausgeben
        for (Rectangle rec : rectangles) {
            System.out.println("\n" + ++i + ". Rechteck");
            System.out.println(rec.getA());
            System.out.println(rec.getB());
            // Fläche
            if (mode == 1 || mode == 4) {
                System.out.println(rec.getArea());
            }
            // Umfang
            if (mode == 2 || mode == 4) {
                System.out.println(rec.getCircumference());
            }
            // Diagonale
            if (mode == 3 || mode == 4) {
                System.out.println(rec.getC());
            }  
        }
    }
}

class Rectangle{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return "Seite A:\t" + a + " cm";
    }

    public String getB() {
        return "Seite B:\t" + b + " cm";
    }

    // Fläche
    public String getArea( ){
        return "Fläche:\t\t" + this.a * this.b + " cm^2";
    }

    // Umfang
    public String getCircumference() {
        // Anscheinend muss man das echt Klammern, sonst kommt bei 10+20 1020 raus...
        return "Umfang:\t\t" + (2 * this.a + 2 * this.b) + " cm";
    }
    // Diagonale
    public String getC() {
        // c = sqrt(a² + b²)
        return String.format("Diagonale C:\t%.2f cm",Math.pow(Math.pow(this.a, 2) + Math.pow(this.b, 2), 0.5));
    }
}