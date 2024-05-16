import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Textgeber {

    public void gibText(String pfad) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(pfad));

        /* Ein Delimter bestimmt an welches Zeichen ein Text getrennt wird */
        scanner.useDelimiter(";");

        while(scanner.hasNext()){
            System.out.print(scanner.next());
        }
    }
}