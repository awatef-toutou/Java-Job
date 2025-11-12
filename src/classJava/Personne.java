package classJava;

public class Personne {
    int age;
    String  nom;
    String prenom;
    double taille;
    String genre;
    String villenatale;

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
}



//public int getAge()
//    {return age;}
//
//    public String getNom()
//    {return nom;}
//
//    public String getPrenom()
//    {return prenom;}
//
//    public double getTaille()
//    {return taille;}
//
//    public String getGenre()
//    {return genre;}
