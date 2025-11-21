import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Somme {
    public static void main(String[] args) {
//un simple tableau
        int [] tab = {1, 12, 34, 5};
        int somme=0;
        for (int i=0; i< tab.length-1; i++)
        {
            somme+=tab[i];

        }
        System.out.println("la somme d un tableau "+somme);
// avec une liste
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11, 12, 34, 5));
        Integer sommelist=0;
        for (Integer n : list)
        {
           sommelist +=n;
        }
        System.out.println("la somme d une liste " +sommelist);
    }
}
