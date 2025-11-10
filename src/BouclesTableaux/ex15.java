package BouclesTableaux;

import javax.swing.plaf.OptionPaneUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args)
    {
     minimum();
    }
    static void minimum()
    {
        Scanner c = new Scanner(System.in);
        int [] Tab =  new int[8];
        System.out.println("--------you have to input 8 elements--------");
        for (int i=0; i<Tab.length; i++)
        {
            System.out.print("enter element n°"+i+" is: "); //create the array
            Tab[i]=c.nextInt();
        }
        System.out.println("-------------------------------------------");
        System.out.println("Elements of the array: ");//display the array
        for (int i :Tab)
        {
            System.out.print(i+"|");
        }

        System.out.println();
        System.out.println("-------------------------------------------");
        int index = 0; //define the index i as the smallest by default
        int smallest =Tab[0];
            for (int i = 0; i < Tab.length; i++) // j the index for smallest
            {
                if (Tab[i] < smallest) //we compare the smallest to the new index
                {
                    smallest=Tab[i];
                    index = i;// if true so the index j become the new smallest

                }
            }
            System.out.println("the smallest element is : "+smallest+" index: "+index);
        System.out.println("-------------------------------------------");

        }

}
