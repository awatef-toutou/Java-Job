package classJava.job15;

public class JeuDeDe {
    public double value;
    public Joueur Joueur1 ;
    public Joueur Joueur2;

    public JeuDeDe(Joueur joueur1)
    {
        this.Joueur1=joueur1;
    }


    public double  lancer()
    {
        value =Math.round(Math.random() * 7);
        return value;
    }
    public void afficherResultat()
    {
        System.out.println("le dernier resultat : "+lancer());
    }
     public void Jeux ()
     {


     }
}
