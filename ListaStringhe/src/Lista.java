public class Lista {
    private Nodo root;

    public Lista() {
        this.root = null;
    }
    // Aggiunge un nuovo nodo con il valore specificato alla fine della lista
    public void addTail(Nodo valore) {
        if (root == null) {
            this.root = valore;
        } else {
            Nodo current = root;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(valore);
        }
    }

    public void addHead(Nodo valore) {
        if (root == null) {
            this.root = valore;
        } else {
            valore.setNext(root);
            this.root = valore;
        }
    }
    // Stampa tutti i valori nella lista
    public void stampa() {
        Nodo current = root;
        while (current != null) {
            System.out.println(current.getValore());
            current = current.getNext();
        }
    }
}