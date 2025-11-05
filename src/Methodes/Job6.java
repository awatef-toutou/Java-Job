package Methodes;

public class Job6 {
    public static void main(String[] args) {
     leetSpeak("AWATEF");
    }

    static String leetSpeak(String str) {
        String result = "";
        char[] tab = str.toCharArray();
        for (int i = 0; i < tab.length; i++)
            if (tab[i] == 'A') {
                tab[i] = '4';
            } else if (tab[i] == 'B') {
                tab[i] = '8';
            } else if (tab[i] == 'E') {
                tab[i] = '3';
            } else if (tab[i] == 'G') {
                tab[i] = '6';
            } else if (tab[i] == 'L') {
                tab[i] = '1';
            } else if (tab[i] == 'S') {
                tab[i] = '5';
            } else if (tab[i] == 'T') {
                tab[i] = '7';
            } else {
                continue;
            }System.out.println(tab);
        return result;
    }
    }




