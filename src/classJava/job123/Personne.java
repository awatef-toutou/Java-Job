package classJava.job123;
//class
public class Personne {
    int age;
    String  nom;
    String prenom;
    double taille;
    String genre;
    String villenatale;

    //constructeur
    public Personne(int age, String nom , String prenom, double taille,String genre, String villenatale)
    {
        this.age=age;
        this.nom=nom;
        this.prenom=prenom;
        this.taille=taille;
        this.genre=genre;
        this.villenatale=villenatale;
    }

    public void displayville()
    {
        System.out.println(villenatale);
    }
    public void sePrésenter()
    {
        System.out.println("je m'appelle "+nom+" et j'ai "+age);
    }
}

