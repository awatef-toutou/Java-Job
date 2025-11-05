package Methodes;

public class Job5 {
    static int occurrences(String str, char c)
    {   int count =0;
        char[] tab = str.toCharArray();
        for (int i : tab)
            if ( i == c)
            {
                count++;
            }
        return  count;
    }

    public static void main (String[] args) {
        System.out.println("nombre d'occurences est: "+occurrences("awatef",'a'));
    }
}


