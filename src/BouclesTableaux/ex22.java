package BouclesTableaux;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args)
    {
        copy();
    }
    static void copy()
    {
        int [] Tab ={12,2,34,0,22};
        System.out.println("----------------------------------------");
        for (int i: Tab)
        {
            System.out.print("|"+i+"|");
        }
        System.out.println();
        System.out.println("----------------------------------------");
        int [] newTab = new int[Tab.length];
        System.arraycopy(Tab, 0, newTab, 0, Tab.length);
        for (int i: newTab)
        {
            System.out.print("|"+i+"|");
        }
    }
}
