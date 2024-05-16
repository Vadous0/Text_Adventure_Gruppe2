import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Textgeber textgeber = new Textgeber();

        textgeber.gibText("Texts/StoryIntro.csv");

    }
}
