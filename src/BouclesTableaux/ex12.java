package BouclesTableaux;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        password();
    }

    static void password() {
        String passwd = "A123_"; // define the password
        char[] passwdTab = passwd.toCharArray(); // convert the String to array
        Scanner c = new Scanner(System.in);
        System.out.println("------------- Guess the password -------------");
        System.out.println("It must contain a maximum of 4 characters");
        System.out.println("----------------------------------------------");
        String guess = c.nextLine();//input of the password guessed by user
        char[] guessTab = guess.toCharArray();
        System.out.println("----------------------------------------------");
        boolean verify = false;
        int count = 0;
            for (int i : passwdTab) {
                for (int j : guessTab) {
                    if (i == j) {
                        count++;
                    }
                }
            }
            if (count == passwdTab.length) {
                System.out.println("password correct");
            } else {
                System.out.println("password false!");
                //System.out.println("try again ");
                //guess = c.nextLine(); // I want to restart the operation !!!!!
            }

    }
}




