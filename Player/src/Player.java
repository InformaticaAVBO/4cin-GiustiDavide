import java.io.FileWriter;
import java.io.IOException;

public class Player {

    private String nome;
    private int valore;

    public Player(String nome, int valore) {
        this.nome = nome;
        this.valore = valore;
    }

    public String getNome() {
        return nome;
    }

    public int getValore() {
        return valore;
    }

    // Metodo che salva il valore in un file avente come nome il nome del player
    public void salvaValoreSuFile() {
        String nomeFile = nome + ".txt";

        try (FileWriter writer = new FileWriter(nomeFile)) {
            writer.write("Nome player: " + nome + "\n");
            writer.write("Valore player: " + valore);
            System.out.println("File \"" + nomeFile + "\" creato correttamente.");
        } catch (IOException e) {
            System.out.println("Errore nella scrittura del file: " + e.getMessage());
        }
    }
}
