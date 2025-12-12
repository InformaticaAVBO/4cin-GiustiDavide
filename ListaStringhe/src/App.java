public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        lista.addTail(new Nodo("Mario"));
        lista.addTail(new Nodo("Giulio"));
        lista.addTail(new Nodo("Francesco"));
        lista.stampa();
    }
}
