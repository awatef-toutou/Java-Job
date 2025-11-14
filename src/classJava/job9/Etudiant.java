package classJava.job9;

public class Etudiant {
    private String nom;
    private double moyenne;

    public Etudiant( String nom, double moyenne)
    {
        this.moyenne = moyenne;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    public double getMoyenne() {
        return moyenne;
    }
    public void setNom(String newnom) {
        this.nom = newnom;
    }
    public void setMoyenne(double newmoyenne) {
        this.moyenne = newmoyenne;
    }


    public void afficherInfos()
    {
        if (moyenne>=10)
        {
            System.out.println("l'étudiant "+nom+" est admis avec une moyenne de "+moyenne);

        }else{
            System.out.println("l'étudiant "+nom+" est récalé");
        }
    }


}
