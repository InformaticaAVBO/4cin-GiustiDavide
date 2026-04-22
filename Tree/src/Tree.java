public class Tree<T> {
    private Nodo<T> root;

    public Tree() {
        this.root = null;
    }

    public void add(T info) {
        Nodo<T> newNode = new Nodo<>(info);
        if (root == null) {
            root = newNode;
        } else {
            newNode.setRight(root);
            root = newNode;     
        }
    }
}
