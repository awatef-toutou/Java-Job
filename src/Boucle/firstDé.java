package Boucle;

import java.util.Scanner;

public class firstDé {
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        System.out.println("deviner le resultat: ");
        long choice = c.nextLong();
        long de1 = Math.round(Math.random() * 6);
        long de2 = Math.round(Math.random() * 6);
        long result = de2+de1;

        if (result == choice)
        {System.out.println("gagner");}
        else {
            System.out.println("perdu");
        }



    }

}
