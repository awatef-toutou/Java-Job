package classJava.job56;

public class Voiture {
    String marque;
    double vitesse;

    public Voiture(String marque, double vitesse)
    {
        this.marque=marque;
        this.vitesse=vitesse;
    }
    public void accelerer()
    {
        vitesse = vitesse+10;
        System.out.println("la nouvelle vitesse "+vitesse);
    }
    public void display()
    {
        System.out.println("la marque est "+marque+ " et de vitesse "+vitesse);
    }
}
