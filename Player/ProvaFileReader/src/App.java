import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws Exception {
        File f = new File("data/test.txt");
        try (Scanner scanner = new Scanner(f)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            System.exit(-1);
        }

    }
}
