public class Somme {
    public static void main(String[] args) {

        int [] tab = {1, 12, 34, 5};
        int somme=0;
        for (int i=0; i< tab.length-1; i++)
        {
            somme+=tab[i];

        }
        System.out.println(somme);
    }
}
