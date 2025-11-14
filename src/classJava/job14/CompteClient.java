package classJava.job14;

public class CompteClient {
    public CompteBancaire cb;
    public String nomClient;


    public CompteClient(String nomClient, CompteBancaire cb)
    {

        this.nomClient = nomClient;
        this.cb=cb;
    }
    public void afficheInfo()
    {
        System.out.println("le compte du "+nomClient+ " a pour solde "+cb.solde); // IL  faut appeler l attribu de lobjet ici cb c objet et solde son attibu
    }
}
