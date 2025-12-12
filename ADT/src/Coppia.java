public class Coppia {
    protected Integer primo;
    protected Integer secondo;

    public Coppia( Integer primo, Integer secondo ) {
        this.primo = primo;
        this.secondo = secondo;
    }

    public Integer getPrimo() {
        return primo;
    }

    public Integer getSecondo() {
        return secondo;
    }

    public String toString() {
        return "(" + primo + ", " + secondo + ")";
    }
}
