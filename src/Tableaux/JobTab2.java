package Tableaux;

public class JobTab2 {
    public static void main(String[] args)
    { //afficher les index pairs de la chaine de caractére
        String str = "Tous ces instants seront perdus dans le temps comme les larmes sous la pluie.";
        char[] tab = str.toCharArray();//transformer ma chaine de caratère en tableau
        for (int i =0; i< tab.length; i++)
        {
            if (i%2 == 0)
            {
                System.out.print(tab[i]);
            }
        }

    }
}
