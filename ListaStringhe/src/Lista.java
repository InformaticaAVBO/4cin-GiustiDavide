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

    public void remove( String s ) {
        if (root == null) {
            return;
        }
        if (root.getValore().equals(s)) {
            root = root.getNext();
            return;
        }
        Nodo current = root;
        while (current.getNext() != null && !current.getNext().getValore().equals(s)) {
            current = current.getNext();
        }
        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
        }
    }

    public boolean exists( String s ) {
        Nodo current = root;
        while (current != null) {
            if (current.getValore().equals(s)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
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