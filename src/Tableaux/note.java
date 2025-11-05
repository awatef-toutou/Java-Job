import java.util.Scanner;

public class note {
    public static void main (String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("entrer votre note: ");
        double moy = c.nextDouble();
        if( moy >= 16 ){
            System.out.println("trés bien");
        } else if ( moy >= 12) {
            System.out.println("bien");
        } else if ( moy >= 10) {
            System.out.println("assez bien");
        } else {
            System.out.println("insuffisant");
        }
    }

    }

