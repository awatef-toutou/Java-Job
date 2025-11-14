package classJava.job13;

public class Main {
    public static void main(String[] args)
    {
        Produit pdt = new Produit("biscuit", 2.5, 20);
        System.out.println(pdt.calculerPrixTTC());
        pdt.prixHT = 1.4;
        System.out.println(pdt.calculerPrixTTC());
    }
}
