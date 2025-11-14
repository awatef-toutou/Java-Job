package classJava.job7;

public class Main {
    public static void main(String[] args)
    {
        CompteBancaire cb = new CompteBancaire(300);
        cb.deposer(150);
        cb.afficherSolde();
        cb.retirer(600);
        cb.afficherSolde();
        cb.retirer(300);
        cb.afficherSolde();
    }
}
