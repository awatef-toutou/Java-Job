public class JobTab6 {
    public static void main(String[] args)
    { //afficher la chaine à l envers
        String str ="Les choses que l'on possède finissent par nous posséder.";
        char[] tab = str.toCharArray();
        for (int i = tab.length-1; i>=0; i--)
        {
            System.out.print(tab[i]);
        }


    }
}
