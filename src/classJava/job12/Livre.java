package classJava.job12;

public class Livre {
   public String titre;
   public String auteur;
   public int nbPage;


   public Livre(String titre, String auteur, int nbPage)
   {
       this.titre = titre;
       this.auteur = auteur;
       this.nbPage = nbPage;
   }
    public void afficherInfos()
    {
        System.out.println("le livre "+titre+ "son auteur est "+auteur+ "contient "+nbPage+" pages");
    }

    public boolean  estLong(int nbPage)
    {
        boolean test = false;
       if (nbPage>300)
       {
           test = true;
           System.out.println("le livre est trop long");
       }else {
           System.out.println("longueur correcte");
       }
       return test;

    }
}
