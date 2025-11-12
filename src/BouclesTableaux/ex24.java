package BouclesTableaux;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args)
    {
        occurrence();
    }
    static void occurrence()
    {
        int [] Tab ={2,35,12,3,34,0,22,98,67,4,22,22,13,87,9};
        int countp =0;
        int countn;
        int count =0;

        System.out.println("----------------------------------------");
        for (int j : Tab) {
            while (j % 2 == 0) {
                countp++;
                j++;
            }count++;
        }
        System.out.println("number of even numbers is: "+countp);
        countn=count-countp;
        System.out.println("number of odd numbers is : "+countn);
    }

}
