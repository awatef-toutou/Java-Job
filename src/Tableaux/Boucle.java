import java.util.Scanner;

public class Boucle {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        /*System.out.println("croissant: ");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("decroissant: ");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }*/

        System.out.print("les nombres paires: ");
       for (int i=0; i<= 20; i++)
            if (i % 2 == 0) {
                System.out.print(" "+i+" ");
            }


    }
}