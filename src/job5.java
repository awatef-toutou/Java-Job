public class job5 {

    static void main(String[] args) {

        for( int i=0; i<=1000; i++)
          {
              for(int j = 2 ; j<i ; j++ )
              {
                  if(i % j == 0) {
                      break;
                  } else {
                      System.out.println(i);
                  }

              }
          }



    }
}
