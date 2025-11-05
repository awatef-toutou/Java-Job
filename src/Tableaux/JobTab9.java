package Tableaux;

import java.util.Scanner;

public class JobTab9 {
public static void main(String[] args)
{
  Scanner scan = new Scanner(System.in);
  System.out.print("Tape your integer: ");
  int n = scan.nextInt();
  int [] tab = {4, 5, 7, 9, 11};
  int somme=0 ;
  for(int i= 1; i < n; i++)
  {
      for(int j = 0 ; j<tab.length; j++) {
      if ( i%tab[j] == 0)
      {
          //System.out.println(tab[j]);
          //System.out.println(i);
           somme += i;
      }

      }
  }System.out.println("the addition of alL divisible between o & your integer is : "+somme );

}

}
