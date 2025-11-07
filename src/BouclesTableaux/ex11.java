package BouclesTableaux;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args)
    {
     converter();
    }

    static void converter()
    {
        Scanner c= new Scanner(System.in);
        int choice ;
        int tem ;
        do{
            System.out.println("****converter of temperature****");
            System.out.println("1-Celsius to Fahrenhei");
            System.out.println("2-Fahrenheit to Celsius");
            System.out.println("3-Exit");
            System.out.println("enter your temperature: ");
            tem= c.nextInt();
            System.out.println("enter your choice: ");
            choice = c.nextInt();
            int F;
            int C;
        if(choice == 1)
            {
               F= (C * (9/5)) + 32;
                System.out.println(""+F);
            } else if  (choice == 2) {
              C = (F - 32) * (5/9);
            System.out.println(""+C);
           }


        }while(choice!=3);


    }

}
