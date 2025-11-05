public class JobTab7 {
    public static void main(String[] args) {
        //Switch index
        String str = "Certaines choses changent, et d'autres ne changeront jamais.";
        char[] tab = str.toCharArray();
        //define new Str
        char[] nvll = str.toCharArray();
        System.out.print(Character.toUpperCase(nvll[1])); //put the first of the new string nvll on Upper case
        for(int i= 0; i< tab.length; i++)
        {
            if(i < tab.length-1)
            {
                nvll[i]=tab[i+1]; // swap of index
            }
            else { // to i=length
                nvll[i]=tab[0]; //affected the first char to the last
                 }
        }System.out.print(nvll);
    }
}