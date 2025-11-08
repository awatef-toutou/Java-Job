package BouclesTableaux;

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

        for (int i=0; i<Tab.length; i++)
        {
            System.out.print("enter element n°"+i+" is: "); //create the array
            Tab[i]=c.nextInt();
        }

        System.out.println("Elements of the array: ");//display the array
        for (int i :Tab)
        {
            System.out.print("|"+i+"|");
        }

        System.out.println();

        for (int i = 0; i < Tab.length; i++) // browse the tab
        {
            int smallest = i; //define the index i as the smallest by default
            for (int j = i + 1; j < Tab.length; j++) // j the index for smallest
            {
                if (Tab[j] < Tab[smallest]) //we compare the smallest to the new index
                {
                    smallest = j;// if true so the index j become the new smallest
                }
            }
            System.out.println("the smallest element is : "+Tab[smallest]);
            System.out.println("the index of the smallest element is : "+smallest);
        }
    }

}
