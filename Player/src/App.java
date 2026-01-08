public class App {

    public static void main(String[] args) {

        Player p1 = new Player("Mario", 100);
        Player p2 = new Player("Luigi", 80);
        Player p3 = new Player("Peach", 120);

        System.out.println("Salvataggio dei player su file...\n");

        p1.salvaValoreSuFile();
        p2.salvaValoreSuFile();
        p3.salvaValoreSuFile();

        System.out.println("\nOperazione completata.");
    }
}
