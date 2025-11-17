package tester;

public class Chaise {
    public double poid;
    private String couleur;
    public double taille;

    public Chaise()
    {
        double poid = 0;
        String couleur ="";

        double taille = 0;
    }
    public Chaise(double poid, String color, double taille)
    {
        this.poid = poid;
        this.couleur = color;
        this.taille = taille;
    }

    public void display()
    {
        System.out.println("la chaise  "+couleur+ " a pour poid "+poid+ "et une taille "+taille);
    }


    public void setColor(String newcolor)
    {
        this.couleur = newcolor;
    }
    public String getCouleur() {
        return couleur;
    }

    public static class NewChaise {
        int nb =12;


        public void displaynb()
        {
            System.out.println("le nombre de chaise est :"+nb);
        }

    }




}
