package BouclesTableaux;

import java.util.Scanner;

public class ex19 {
    public static void main()
    {
    inverse();
    }
    static void inverse ()
    {
        Scanner c =new Scanner(System.in);
        int [] Tab = new int[7];
        System.out.println("-------------enter element of your array-------------");
        for (int i=0; i< Tab.length; i++) {
            System.out.print("n° " + i + " est : ");
            Tab[i] = c.nextInt();

        }
        System.out.println("the array: ");
        for (int i :Tab)
        {
            System.out.print("|"+i+" ");
        }
        System.out.println();
        System.out.println("the array reversed ");
        for (int j= Tab.length-1; j>=0; j--)
        {
            System.out.print("|"+Tab[j]+" ");
        }

    }
}
