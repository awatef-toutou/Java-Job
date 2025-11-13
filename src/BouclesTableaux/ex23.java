package BouclesTableaux;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args)
    {
        carré();
    }
    static void carré()
    {
        int [] Tab ={1,2,3,4,5,6,7,4,9,10};
        System.out.println("----------------------------------------");
        for (int i: Tab)
        {
            System.out.print(+i+" | ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------");
        for (int i=0; i<10; i++)
        {
            Tab[i] =Tab[i]*Tab[i]; //tab[i-1]= mathpowExact(i,2)
        }
        for (int i: Tab)
        {
            System.out.print(+i+" | ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------");
    }
}
