import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws FileNotFoundException {
        /* Die Klasse Scanner kann neben der Eingabe von Nutzern auch Texte aus Datein einlesen hier z.B. die Datei
         Intro in dem Ordner Textes mit den Namen Intro.csv.
         */
        Scanner scanner = new Scanner(new File("Texts/Intro.csv"));

        /* Ein Delimter bestimmt an welches Zeichen ein Text getrennt wird
         */
        scanner.useDelimiter(";");

        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
