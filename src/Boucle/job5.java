package Boucle;

public class job5 {

    static void main(String[] args) {

        for( int i=2; i<=1000; i++)
          {
              boolean premier = true;
              for(int j = 2 ; j<=Math.sqrt(i) ; j++ )
              {
                  if(i % j == 0) {
                      premier  =false;
                      break;
                  }
              }
              if (premier) System.out.println(i);
          }



    }
}
