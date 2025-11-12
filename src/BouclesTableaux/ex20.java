package BouclesTableaux;

import java.util.Scanner;

public class ex20 {

    public static void main(String[] args)
    {
        lookfor();
    }

    static void lookfor()
    {
        int [] Tab ={12,2,34,0,22,9,1,3};
        System.out.println("----------------------------------------");
        System.out.print("what the number you search? ");
        Scanner c = new Scanner(System.in);
        int number = c.nextInt();
        for (int i=0; i< Tab.length;i++)
        {
            if (Tab[i]==number) {
                System.out.println("----------------------------------------");
                System.out.println("it exist at the index n°: " + i);
           return; // to stop
            }
        }System.out.println("don't exist");
    }
}
