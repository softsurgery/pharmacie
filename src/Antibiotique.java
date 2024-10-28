public class Antibiotique extends Produit {
    private String nomMolecule;

    public Antibiotique() {}

    public Antibiotique(long numero, String nom, double prixFabrication, int qte, String nomMolecule) {
        super(numero, nom, prixFabrication, qte);
        this.nomMolecule = nomMolecule;
    }

    public String getNomMolecule() {
        return nomMolecule;
    }

    public void setNomMolecule(String nomMolecule) {
        this.nomMolecule = nomMolecule;
    }

    @Override
    public String toString() {
        return super.toString() + ",Antibiotique{" +
                "nomMolecule='" + nomMolecule + '\'' +
                '}';
    }
}
