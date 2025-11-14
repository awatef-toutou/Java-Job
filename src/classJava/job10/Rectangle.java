package classJava.job10;

public class Rectangle {
    public double largeur;
    public double longueur;

    public Rectangle(double largeur, double longueur)
    {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public double calculerAire()
    {
        double air;
        air=(largeur*longueur);
        return air;

    }
}
