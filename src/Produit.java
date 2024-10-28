public class Produit {
    private long numero;
    private String nom;
    private double prixFabrication;
    private int qte;

    public Produit() {}

    public Produit(long numero, String nom, double prixFabrication, int qte) {
        this.numero = numero;
        this.nom = nom;
        this.prixFabrication = prixFabrication;
        this.qte = qte;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixFabrication() {
        return prixFabrication;
    }

    public void setPrixFabrication(double prixFabrication) {
        this.prixFabrication = prixFabrication;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "numero=" + numero +
                ", nom='" + nom + '\'' +
                ", prixFabrication=" + prixFabrication +
                ", qte=" + qte +
                '}';
    }
}
