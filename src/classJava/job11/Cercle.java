package classJava.job11;

public class Cercle {
    double rayon;

    public Cercle( double rayon)
    {
        this.rayon = rayon;
    }

    public double calculerPerimetre()
    {
        return 2* 3.14*rayon;
    }
    public double calculerAire()
    {
        return rayon*rayon*3.14;

    }

}
