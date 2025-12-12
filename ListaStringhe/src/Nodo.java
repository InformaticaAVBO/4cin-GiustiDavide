public class Nodo {
    private String valore;
    private Nodo sinistro;
    private Nodo destro;

    public Nodo(String valore) {
        this.valore = valore;
        this.sinistro = null;
        this.destro = null;
    }

    public String getValore() {
        return valore;
    }

    public void setValore(String valore) {
        this.valore = valore;
    }

    public Nodo getSinistro() {
        return sinistro;
    }

    public void setSinistro(Nodo sinistro) {
        this.sinistro = sinistro;
    }

    public Nodo getNext() {
        return destro;
    }

    public void setNext(Nodo next) {
        this.destro = next;
    }
}