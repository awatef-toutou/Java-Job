package BouclesTableaux;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args)
    {
        carré();
    }
    static void carré()
    {
        int [] Tab ={12,2,34,0,22,98,67,4,22,22};
        System.out.println("----------------------------------------");
        for (int i: Tab)
        {
            System.out.print("|"+i+"|");
        }
        System.out.println();
        System.out.println("-----------------------------------------------");
        for (int i=0; i<10; i++)
        {
            Tab[i] =Tab[i]*Tab[i];{
            }
        }
        for (int i: Tab)
        {
            System.out.print("|"+i+"|");
        }
        System.out.println();
        System.out.println("-----------------------------------------------");
    }
}
