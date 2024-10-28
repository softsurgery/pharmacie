public class Main {
    public static void main(String[] args) {
        Paracetamol p1 = new Paracetamol(123,"Clamoxyle",20,30,25);
        Paracetamol p2 = new Paracetamol(124,"Clamoxyleg",50,60,100);
        Antibiotique a1 = new Antibiotique(125,"Strep B",30,40,"Streptomycine B");

        Laboratoire l = new Laboratoire(4);
        l.ajouterProduit(p1);
        l.ajouterProduit(p2);
        l.ajouterProduit(a1);
        l.ajouterProduit( new Antibiotique(126,"Strep A",30,40,"Streptomycine A"));

        System.out.println(l);
    }
}