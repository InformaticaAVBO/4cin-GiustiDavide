import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {

    public static void copyFile(String FileIn, String FileOut) throws Exception {
        File f = new File(FileIn);
        Scanner leggi = new Scanner(f);
        FileWriter scrivi = new FileWriter(FileOut);
        while (leggi.hasNextLine()) {
            String s = leggi.nextLine();
            scrivi.write(s + "\n");
        }
        leggi.close();
        scrivi.close();
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dimmi il nome del file sorgente: ");
        String nomeSorgente = scanner.nextLine();
        System.out.println("dimmi il nome del file di destinazione:");
        String nomeDestinazione = scanner.nextLine();
        scanner.close();

        
        copyFile(nomeSorgente, nomeDestinazione);
        System.out.println("copia completata di: " + nomeSorgente + " in " + nomeDestinazione);


    }
}
