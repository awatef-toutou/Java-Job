public class job4 {
    static void main(String[] args) {

    for (int i =0; i<=100; i++)
    {
        if( i%3==0)
        {
            System.out.println("FRIZ"+" "+i );
        } else if ( i%5==0)
           {
               System.out.println("BUZZ"+" "+i);
           }
        if (i%3==0 && i%5==0) {
            System.out.println("FRIBUZZ"+" "+i);
        }


    }

    }
}