package BouclesTableaux;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        multiplication();
    }

    static void multiplication() {
        Scanner c = new Scanner(System.in);
        int[] Tab = new int[5];
        int multi =1;
        for (int i = 0; i < 5; i++)
        {
            System.out.println("-------------------------------------------");
            System.out.print("enter your Tab element n°" + i + ": ");
            Tab[i] = c.nextInt();
            multi *= Tab[i];

        }
        System.out.println("--------------------------------------------");
        System.out.println("Elements of the array: ");
        for (int i :Tab)
        {
            System.out.print("|"+i+" ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("the multiplication of elements of the array is : ");
        System.out.println(multi+" ");
        System.out.println("-----------------------------------------------");
    }
}
