package classJava.job8;

public class Etudiant {
    String nom;
    double moyenne;

    public Etudiant(String nom, double moyenne)
    {
        this.nom = nom;
        this.moyenne =moyenne;

    }
    public void afficherInfos()
    {
     if (moyenne>=10)
     {
         System.out.println("l'étudiant "+nom+" est admis");

     }else{
         System.out.println("l'étudiant "+nom+" est récalé");
     }
    }
}
