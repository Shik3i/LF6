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
            System.out.println(rec.getAAsText());
            System.out.println(rec.getBAsText());
            // Fläche
            if (mode == 1 || mode == 4) {
                System.out.println(rec.getAreaAsText());
            }
            // Umfang
            if (mode == 2 || mode == 4) {
                System.out.println(rec.getCircumferenceAsText());
            }
            // Diagonale
            if (mode == 3 || mode == 4) {
                System.out.println(rec.getCAsText());
            }
        }

        testRectangle();
    }

    public static void testRectangle() {
        System.out.println();
        System.out.println("UnitTests:");
        Rectangle tester = new Rectangle(2, 2);
        testCompareInt(4, tester.getArea(), "Area must be 4.");
        testCompareInt(8, tester.getCircumference(), "Circumference must be 8");
        testCompareDouble(Math.pow(8, 0.5), tester.getC(), 0.00001, "C must be " + Math.pow(8, 0.5));
    }

    public static void testCompareInt(int a, int b, String errorMessage) {
        if (a == b)
            System.out.println("Test passed");
        else
            System.out.println("Test failed: " + errorMessage);
    }

    public static void testCompareDouble(double a, double b, double delta, String errorMessage) {
        if (a <= b + delta 
            || a >= b - delta)
            System.out.println("Test passed");
        else
            System.out.println("Test failed: " + errorMessage);
    }
}

class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public String getAAsText() {
        return "Seite A:\t" + this.a + " cm";
    }

    public String getBAsText() {
        return "Seite B:\t" + this.b + " cm";
    }

    // Fläche
    public int getArea(){
        return this.a * this.b;
    }

    public String getAreaAsText(){
        return "Fläche:\t\t" + this.getArea() + " cm^2";
    }

    // Umfang
    public int getCircumference() {
        return 2 * this.a + 2 * this.b;
    }

    public String getCircumferenceAsText() {
        return "Umfang:\t\t" + this.getCircumference() + " cm";
    }

    // Diagonale
    public double getC() {
        // c = sqrt(a² + b²)
        return Math.pow(Math.pow(this.a, 2) + Math.pow(this.b, 2), 0.5);
    }

    public String getCAsText() {
        return String.format("Diagonale C:\t%.2f cm", this.getC());
    }
}