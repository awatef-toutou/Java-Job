package Tableaux;

import java.util.Scanner;

public class NegaPosiNul {
    public static void main (String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println( "entrer votre nombre: " );
        double nb= c.nextDouble();
        if ( nb < 0 ){
            System.out.println(" votre nombre est négative");
        } else if (nb > 0) {
            System.out.println( " voter nombre est positive");
        } else {
            System.out.println("votre nombre est nul");
        }



    }
}
