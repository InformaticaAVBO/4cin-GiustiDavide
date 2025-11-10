public class Squadra {

    String posizione;
    String nome;
    String punti;
    String partite, vinte, perse, pareggiate;


    public Squadra(String posizione, String nome, String punti, String partite, String vinte, String perse, String pareggiate) {
        this.posizione = posizione;
        this.nome = nome;
        this.punti = punti;
        this.partite = partite;
        this.vinte = vinte;
        this.perse = perse;
        this.pareggiate = pareggiate;
    }

    

    @Override
    public String toString() {
        return posizione+"° \t"+ nome + " \t"+ punti +"pt \t"+ partite+ " \t"+ vinte+ " \t"+ pareggiate+ " \t"+ perse;
    }

    public String getPosizione() {
        return posizione;
    }

    public void setPosizione(String posizione) {
        this.posizione = posizione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPunti() {
        return punti;
    }

    public void setPunti(String punti) {
        this.punti = punti;
    }

    public String getPartite() {
        return partite;
    }

    public void setPartite(String partite) {
        this.partite = partite;
    }

    public String getVinte() {
        return vinte;
    }

    public void setVinte(String vinte) {
        this.vinte = vinte;
    }

    public String getPerse() {
        return perse;
    }

    public void setPerse(String perse) {
        this.perse = perse;
    }

    public String getPareggiate() {
        return pareggiate;
    }

    public void setPareggiate(String pareggiate) {
        this.pareggiate = pareggiate;
    }
}