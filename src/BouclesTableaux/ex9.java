package BouclesTableaux;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args)
    {
     premier();
    }
     static void premier()
     {
         Scanner c = new Scanner(System.in);
         System.out.println("enter your number : ");
         int number = c.nextInt();

         while (number!=0){
           if((number%2==0)||(number%3==0)||(number%5==0)||(number%7==0))
           {
               System.out.println("Pas premier");
           }else {
             System.out.println("Peut etre premier");

           } break;
           }

     }

}
