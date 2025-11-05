package Tableaux;

import java.util.Scanner;
public class somme {
    public static void main (String[] args) {
        int somme = 0;

        for (int i=1; i<=100; i++)
        {
            somme += i;
        }
        System.out.println("la somme est: "+somme);

    }
}
