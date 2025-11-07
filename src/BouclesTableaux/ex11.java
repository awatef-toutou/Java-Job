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
        do{
            System.out.println("****converter of temperature****");
            System.out.println("enter your temperature: ");
            int tem= c.nextInt();
            System.out.println("1-Celsius to Fahrenhei");
            System.out.println("2-Fahrenheit to Celsius");
            System.out.println("3-Exit");

            System.out.println("enter your choice: ");
            choice = c.nextInt();
        if(choice == 1)
            {
               int temf= (tem * (9/5)) + 32;
                System.out.println(""+temf);
            } else if  (choice == 2) {
              int tempc = (tem- 32) * (5/9);
            System.out.println(""+tempc);
           }


        }while(choice!=3);


    }

}
