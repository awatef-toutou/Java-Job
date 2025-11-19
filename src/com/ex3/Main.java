package com.ex3;

public class Main {
    public static void main(String[] args)
    {
        int num = 1222221;
        Plaindrome n = new Plaindrome();

        if (n.estPalindrome(num))
        {
            System.out.println("est plaindrome");
        } else {
            System.out.println("ils sont pas");
        }
    }
}
