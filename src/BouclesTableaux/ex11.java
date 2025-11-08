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
            System.out.println("**** Converter of Temperature ****");

            System.out.println("1-Celsius to Fahrenhei");
            System.out.println("2-Fahrenheit to Celsius");
            System.out.println("3-Exit");
            System.out.println("enter your choice: ");
            choice = c.nextInt();
            System.out.println("enter your temperature: ");
            int temp= c.nextInt();
        if(choice == 1)
            {
               int tempF= (temp * 9/5) + 32;
                System.out.println(""+tempF);
            } else if  (choice == 2) {
              int tempC = (temp - 32)*5/9;
            System.out.println(""+tempC);
           }
        }while(choice!=3);


    }

}
