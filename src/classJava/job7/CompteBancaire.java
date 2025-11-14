package classJava.job7;

public class CompteBancaire {
    double solde;


    public CompteBancaire(double solde)
    {
        this.solde = solde;
    }

    public void deposer(double montant)
    {
      solde += montant;
    }
    public void retirer(double montant)
    {
        if ((solde>montant))
        {
            solde -= montant;
        }
        else {System.out.println("votre solde est insufisant");}
    }
    public void afficherSolde()
    {
        System.out.println("votre solde" + " est : "+solde);
    }
}
