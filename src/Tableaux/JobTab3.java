package Tableaux;

public class JobTab3 {
    public static void main(String[] args) {
        //afficher que les voyelles de la chaine de caractéres
        String str = " I'm sorry Dave I'm afraid I can't do that ";
        char[] tab = str.toCharArray();
        for (char c : tab) {
            if ((c == 'i') || (c == 'o') || (c == 'a') || (c == 'y') || (c == 'u') || (c == 'e') || (c == 'I')) {
                System.out.print(c + " ");
            }
        }
    }
}
