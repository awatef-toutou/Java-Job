package BouclesTableaux;

import java.util.Scanner;

public class ex8 {
   public static void main(String[] args)
   {
       ex8.numbers();
   }

    static int numbers(){
        System.out.println("enter your number: ");

        Scanner c = new Scanner(System.in);
        int number = c.nextInt();
        int count =0;
        if(number<0)
        {
            number= -number;
        }
        while(number>0)
        {
            number=number/10;
            count++;

        }
        System.out.println(count);

       return count;
    }


}
