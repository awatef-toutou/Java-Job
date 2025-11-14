package classJava.job10;

public class Rectangle {
    double largeur;
    double longueur;

    public Rectangle(double largeur, double longueur)
    {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public double calculerAire()
    {  double air;
        air=(largeur*2)+(longueur*2);
        return air;
    }
}
