public class App {
    public static void main(String[] args) throws Exception {
        Nodo<String> nodo1 = new Nodo<>("Nodo 1");
        Nodo<String> nodo2 = new Nodo<>("Nodo 2");
        nodo1.setRight(nodo2);
        System.out.println(nodo1);
        System.out.println(nodo1.getRight());
        Tree<String> tree = new Tree<>();
        tree.add("Nodo 1");
        tree.add("Nodo 2");
        System.out.println(tree);
        
    }
}
