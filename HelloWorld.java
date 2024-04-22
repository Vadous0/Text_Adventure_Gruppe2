import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("Texts/Intro.csv"));
        scanner.useDelimiter(";");

        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}