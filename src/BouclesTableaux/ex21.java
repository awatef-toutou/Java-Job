package BouclesTableaux;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args)
    {
        occurrence();
    }
    static void occurrence()
    {
        int [] Tab ={12,2,34,0,22,98,67,4,22,22};
        System.out.print("what the number you search?  ");
        Scanner c = new Scanner(System.in);
        int number = c.nextInt();
        int count =0;
        System.out.println("----------------------------------------");
        for (int j : Tab) {
            if (j == number) {
                count++;
            }
        }System.out.println("occurrence of "+number+" is : "+count);



    }
}
