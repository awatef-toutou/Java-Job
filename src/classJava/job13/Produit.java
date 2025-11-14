package classJava.job13;

import javax.swing.plaf.PanelUI;

public class Produit {
    public String nom;
    public double prixHT;
    public double tauxTVA;

    public Produit( String nom, double prixHT, double tauxTVA)
    {
        this.nom = nom;
        this.prixHT = prixHT;
        this.tauxTVA = tauxTVA;

    }

    public double calculerPrixTTC()
    {
        return prixHT +(prixHT*tauxTVA/100);
    }
}
