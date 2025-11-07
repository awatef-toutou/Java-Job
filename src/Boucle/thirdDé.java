package Boucle;

import java.awt.*;
import java.util.Scanner;

public class thirdDé {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("deviner le resultat: ");
        long choice = c.nextLong();
        long de1 = Math.round(Math.random() * 6);
        long de2 = Math.round(Math.random() * 6);
        long result =de2+de1;
        System.out.println(+result);
        if (result == choice) {
            System.out.println("winner :)");
        }
        while (choice != result) {

            System.out.println("Try again");
            choice = c.nextLong();
        }
        System.out.println("Winner");

        }
        }










