package BouclesTableaux;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args)
    {
     displayarray();
    }

    static void displayarray()
    {
        Scanner c = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("enter the number of element: ");
        int n= c.nextInt();//input the length of the array
        int []Tab = new int [n];
        System.out.println("----------------------------------------");
        if (n<=10) {  //I want to know how to use while "
            for (int i = 0; i < n ; i++) {
                System.out.print("n°" + i + " : ");
                Tab[i]= c.nextInt();  //fill the array
            }
            System.out.println("----------------------------------------");
            System.out.println("the array: ");
            for (int i : Tab) {
                System.out.print("|" + i + " ");//display the array
            }
        }else {
            System.out.println("----------------------------------------");
            System.out.println("error");
        }

    }

}
