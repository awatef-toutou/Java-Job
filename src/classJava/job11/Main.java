package classJava.job11;

public class Main {
    public static void main(String[] args)
    {
        Cercle c = new Cercle(5);
        System.out.println("le rayon du cer est: "+c.rayon);
        System.out.println("l'aire du cerle est "+c.calculerAire());
        System.out.println("le perimetre du cercle est "+c.calculerPerimetre());

    }
}
