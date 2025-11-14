package classJava.job15;

import classJava.job14.CompteClient;

public class Main {
    public static void main (String[] args)
    {
        Joueur J1 = new Joueur("lea");
        JeuDeDe j1 = new JeuDeDe(J1);
        Joueur J2 = new Joueur("awatef");
        JeuDeDe j2 = new JeuDeDe(J2);

        j1.lancer();
        j2.lancer();
        j1.afficherResultat();
        j2.afficherResultat();

    }
}
