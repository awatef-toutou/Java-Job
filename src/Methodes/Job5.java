public class Job5 {
    static int occurrences(String str, char c)
    {   int count =0;
        char[] tab = str.toCharArray();
        for (int i =0; i<str.length();i++)
            if ( tab[i] == c)
            {
                count++;
            }
        return  count;
    }

    public static void main (String[] args) {
        System.out.println(occurrences("awatef",'a'));
    }
}


