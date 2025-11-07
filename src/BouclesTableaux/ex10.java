package BouclesTableaux;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args)
    {
     affichage();
    }
    static void affichage()
    {
        Scanner c = new Scanner(System.in);
        int choice;
        do{
            System.out.println("*** The menu ***");
            System.out.println("1- Bonjour");
            System.out.println("2- Bonsoir");
            System.out.println("3- Quitter");
            System.out.println("enter your choice: ");
            choice = c.nextInt();
            if(choice ==1)
            {System.out.println("1-Bonjour");
            System.out.println("**********");}
            else if (choice ==2) {
                System.out.println("2-Bonsoir");
                System.out.println("**********");
            }else
                System.out.println("3-Quitter");

        }while (choice != 3);


    }


}
