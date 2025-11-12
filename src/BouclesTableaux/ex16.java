package BouclesTableaux;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args)
    {
     ecartype();
    }
    static void ecartype()
    {
        int [] notes = new int [5];
        int moy=0;
        Scanner c =new Scanner(System.in);
        int somme =0;
        int ecart =0;
        System.out.println("-------------enter element of your array-------------");
        for (int i=0; i< notes.length; i++)
        {
            System.out.print("n° "+i+" est : ");
            notes[i]=c.nextInt();
        }
        for (int i : notes)
        {
           somme = somme +i;
        }
        moy = somme/5;
        System.out.println("-----------------------------------------");
        System.out.println(" the average is : "+moy);
        for (int i=0;i< notes.length;i++)
        {
            System.out.println("-----------------------------------------");
            ecart = notes[i]-moy;
            System.out.println("note n°"+i+": "+notes[i]+",ecart: "+ecart);
        }
    }


}
