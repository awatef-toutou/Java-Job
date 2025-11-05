package Boucle;

public class job3 {

    static void main(String[] args) {

        for(int i= 0; i<= 100; i++)
        {
            if (i == 42)
            {
                System.out.print("La Plateforme_");
            }
            else if( i<= 20) {
                System.out.print("_"+i+"_ ");
           } else if (i > 20 && i<50 ) {
                System.out.print("__"+i+"__");
           }
           else {
              System.out.print(" "+i+" ");
          }
          }

        }




    }

