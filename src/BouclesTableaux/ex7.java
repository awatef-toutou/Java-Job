package BouclesTableaux;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ex7 {


    public static void main(String[] args){
     ex7.somme();
    }

    static int somme ()
    {
        System.out.println("***tape a numer or 0 to exit ***");
        Scanner c = new Scanner(System.in);
        System.out.println("enter your number: ");
        int result=0;
        int a = c.nextInt();

        while ((a!=0))
        {
            System.out.println("enter your second number: ");
            int b = c.nextInt();
            result = a+b;
            if((b==0)){
                System.out.println("exit");
                break;
            }
            System.out.println("la somme est: "+result);
            a= result;

        }

          return  result;

    }
}

