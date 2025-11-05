public class jobTab1 {


    public static void main(String[] args) {
        // dire si le chiffre est pair ou impair
    int[] tab =  {200, 204, 173, 98, 171, 404, 459};
    for (int i = 0 ; i <tab.length; i++)  {
       if (tab[i] % 2 == 0) {
            System.out.println(+tab[i] + " est pair");
        }else {
           System.out.println(+tab[i]+ " est impair");
       }
    }
    }
}
// for( int n :tab)
//{
 //   if ( n%2 == 0)
//{  }else
  //      }