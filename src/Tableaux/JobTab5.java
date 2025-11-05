public class JobTab5 {
    public static void main(String[] args)
    {  //calculer le nombre des voyelles et des consonnes dans la chaine de caractéres
        String str = "On n’est pas le meilleur quand on le croit mais quand on le sait";
        char[] tab = str.toCharArray();
        //System.out.println(tab.length);
        int voy = 0;
        int con = 0;
        for (char c : tab) {
            if ((c == 'i') || (c == 'o') || (c == 'a') || (c == 'y') || (c == 'u') || (c == 'e')||(c == 'O')) {
                voy = voy+1;
            }else if ((c == ' ')||(c == '’'))
                {//pour afficher une virgule il faut marquer comme ça avec un anti slash'\''
                 continue;
                }else {
                con = con+1;
            }

            }
           System.out.println(voy);
           System.out.println(con);

    }
}
