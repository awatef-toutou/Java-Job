package BouclesTableaux;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class ex17 {
    public static void main(String[] args)
    {
        conteur();
    }
    static void conteur()
    {
        Scanner c = new Scanner(System.in);
        int [] Tab = new int[10];
        int negative=0;
        int positive =0;
        int nulll = 0;

        System.out.println("-------------enter element of your array-------------");
        for (int i=0; i< Tab.length; i++)
        {
            System.out.print("n° "+i+" est : ");
            Tab[i]=c.nextInt();
            if (Tab[i]<0)
            {
                negative++;
            } else if (Tab[i]>0){
                positive++;
            }else {
                nulll++;
            }
        }
        System.out.println("number of negative integer is "+negative);
        System.out.println("number of positive integer is "+positive);
        System.out.println("number of null integer is "+negative);
    }
}



