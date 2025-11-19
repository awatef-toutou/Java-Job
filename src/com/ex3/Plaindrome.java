package com.ex3;

public class Plaindrome {

    public boolean estPalindrome(int n)
    {
        int number = n;
        int reversed = 0;
        while(n>0){
            int modulo =n%10; //recuperer mon dernier chiffre
            reversed = reversed*10+modulo;
            n=n/10;
        }
        return  number == reversed;
    }


}
