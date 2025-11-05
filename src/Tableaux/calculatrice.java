import java.util.Scanner;

public class calculatrice {
    public static void main (String[] args){
        //calculatrice simple : addition multiplication soustraction et division
        Scanner c = new Scanner(System.in) ;
        System.out.println(" une simple calculatrice ");
        System.out.println( "entrer votre 1er nombre: ");
        double nb1 = c.nextDouble();
        System.out.println( "entrer votre 2éme nombre: ");
        double nb2 = c.nextDouble();
        System.out.println( "entrer l'opérateur désiré(  +, -, *, /): " + c);
        char op = c.next().charAt(0);
        double resultat;
        if ( op == '+'){
            resultat= nb1  + nb2;
            System.out.println("le résultat est: " +resultat);
        } else if (op == '-') {
            resultat= nb1  - nb2;
            System.out.println("le résultat est: " +resultat);
        } else if (op == '*') {
            resultat= nb1  * nb2;
            System.out.println("le résultat est: " +resultat);
        } else if (op == '/') {
            if( nb2 != 0)
            {resultat= nb1  / nb2;
                System.out.println("le résultat est: " +resultat);
            }  else {
                System.out.println("erreur");
            }
        } else {
            System.out.println("Char not valid");
        }
    }
}

