public class Paracetamol extends Produit {
    private double dosage;

    public Paracetamol() {}

    public Paracetamol(long numero, String nom, double prixFabrication, int qte, double dosage) {
        super(numero, nom, prixFabrication, qte);
        this.dosage = dosage;
    }

    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Paracetamol{" +
                "dosage=" + dosage +
                '}';
    }
}
