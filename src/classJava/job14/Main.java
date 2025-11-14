package classJava.job14;

public class Main {

    public static void main(String[] args)
    {
        CompteBancaire x = new CompteBancaire(500);
        CompteClient c = new CompteClient("dupont",x);
        c.afficheInfo();
    }
}
