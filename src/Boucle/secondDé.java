package Boucle;

import javax.xml.transform.Source;
import java.util.OptionalLong;
import java.util.Scanner;

public class secondDé {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("deviner le resultat: ");
        long choice = c.nextLong();
        long de1 = Math.round(Math.random() * 6);
        long de2 = Math.round(Math.random() * 6);
        long result =de2+de1;
        //System.out.println(+result);
        while (result != choice ){
            System.out.println("deviner le resultat: ");
            long update = c.nextLong();
            if (result == update) break;
        }

}}
