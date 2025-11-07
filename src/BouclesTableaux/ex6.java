package BouclesTableaux;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {


        ex6.devinette();
    }

    static void devinette() {
        Scanner c = new Scanner(System.in);
        System.out.println("deviner le nombre: ");
        long choice = c.nextLong();
        long de = Math.round(Math.random() * 100);
        //int de =(int)(math.random()*101);  il faut revoir !!!!
        while ( de != choice) {
        if (choice < de) {
            System.out.println("est plus petit");
            choice = c.nextLong();
        } else  {
            System.out.println("est plus grand");
            choice = c.nextLong();
        }
        }
        System.out.println("c'est le bon");
        }


}
