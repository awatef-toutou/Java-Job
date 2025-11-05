package Tableaux;

import java.util.Scanner;
public class CalculatriceWithSwitch {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in) ;

        boolean run = true;
        while ( run ) {
            System.out.println();
            System.out.println(" ***** My Calculator ***** ");
            System.out.println( "first number: ");
            double nb1 = c.nextDouble();
            System.out.println( "second number: ");
            double nb2 = c.nextDouble();
            System.out.println( "Tape your choice ");
            System.out.println(" 1 - Addition");
            System.out.println(" 2 - Soustraction");
            System.out.println(" 3 - Multiplication");
            System.out.println(" 4 - Division");
            System.out.println(" 5 - ARRET DE PROGRAMME");
            int op = c.nextInt();
            double result;
            switch (op) {
                case 1:
                    result = nb1 + nb2;
                    System.out.println("la somme de " +nb1 +" + " +nb2+ "est " + result);
                    break;
                case 2:
                    result = nb1 - nb2;
                    System.out.println("la différence de " +nb1 +" - "+nb2+ "est :" + result);
                    break;
                case 3:
                    result = nb1 * nb2;
                    System.out.println("la multiplication" +nb1 +"* " +nb2+ " est ::" + result);
                    break;
                case 4:
                    result = nb1 / nb2;
                    System.out.println("la division de " +nb1 +"/" +nb2+ "=" + result);
                    break;
                case 5:
                    run = false;
                    System.out.println("good bye");
                    break;
                default:
                    System.out.println("try again");
                    System.out.println();
                    break;
            }

        }



    }
}




