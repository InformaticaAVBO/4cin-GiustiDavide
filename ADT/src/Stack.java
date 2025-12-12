public class Stack {
    private Vettore<Object> v;

    public Stack(int start, int delta) {
        v = new Vettore<Object>(start, delta);
    }

    public void push(Object o) {
        v.add(o);
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        int lastIndex = size() - 1;
        Object o = v.get(lastIndex);
        // Optionale: Rimuovere l'ultimo elemento creando un nuovo Vettore senza di esso
        Vettore<Object> newVettore = new Vettore<Object>(v.v.length, v.delta);
        for (int i = 0; i < lastIndex; i++) {
            newVettore.add(v.get(i));
        }
        v = newVettore;
        return o;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        int count = 0;
        while (v.get(count) != null) {
            count++;
        }
        return count;
    }

    public String toString() {
        String s = "Stack contents (top to bottom):\n";
        for (int i = size() - 1; i >= 0; i--) {
            s += v.get(i) + "\n";
        }
        return s;
    }
}
