package com.firstExercice;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabet = new char[26];

        for (int i = 0; i< alphabet.length; i++)
        {
            alphabet[i]= (char) ('A' + i);// (char) on force qu il change le unico de A en un caractére
        }
        System.out.print(Arrays.toString(alphabet)+" "); //java.util to display

    }


}
