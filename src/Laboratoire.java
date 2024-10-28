import java.util.Arrays;

public class Laboratoire extends Object {
    private Produit[] produits;
    private int nbProduits;

    public Laboratoire(int capacite) {
        produits = new Produit[capacite];
        nbProduits = 0;
    }

    public void ajouterProduit(Produit produit) {
        if (nbProduits < produits.length) {
            System.out.println(produit.getNom() + " Product added success");
            produits[nbProduits] = produit;
            nbProduits++;
        } else {
            System.out.println("Laboratory is full");
        }
    }

    @Override
    public String toString() {
        return "Laboratoire{" +
                "produits=" + Arrays.toString(produits) +
                ", nbProduits=" + nbProduits +
                '}';
    }
}
