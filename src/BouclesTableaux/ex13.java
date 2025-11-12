package BouclesTableaux;

import java.util.Arrays;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args)
    {
        doubleTab();
    }
    static void doubleTab()
    {
        System.out.println("----------------------------------");
        Scanner c = new Scanner(System.in);
        System.out.println("enter the size of your array: ");
        int size= c.nextInt();

        System.out.print("Elements");
        System.out.println("----------------------------------");

        int [] Tab = new int[size];
        int [] doubleTab = new int[size];
        for ( int i=0;i<size;i++)
        {
            System.out.println("enter elements n°"+i+" of your array: ");
            Tab[i] = c.nextInt();//Filling of Tab
            doubleTab[i] = Tab[i] * 2;//Filling of doubleTab

        }
        System.out.println("----------------------------------");
        System.out.println("\nElements of your array: ");//display of tab
        for (int i : Tab)
         {
             System.out.print(i+" ");
         }
        System.out.println("\nElements of the ** double ** array: ");//Display of double tab
        for( int i : doubleTab){
            System.out.print(i+" ");
        }
        }

}
