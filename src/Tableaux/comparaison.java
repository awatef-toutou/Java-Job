package Tableaux;

import java.util.Scanner;
public class comparaison {
    public static void main (String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("entrer 1er nombre: ");
        double nb1 = c.nextDouble();
        System.out.println("entrer le 2éme: ");
        double nb2 = c.nextDouble();
        if (nb1 < nb2){
            System.out.println("nb1 est plus petit que nb2");
        }
        else if (nb1 > nb2) {
            System.out.println("nb1 est plus GRAND que nb2");

        } else if (nb1 == nb2) {
            System.out.println("les deux nombres sont egaux");

        }

    }
}
