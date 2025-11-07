package BouclesTableaux;

public class ex2 {
    public static void main (String[] args)
    {
        ex2.fibonacci(8);
    }
     static void fibonacci(int N) {
         int f0 = 0;
         int f1 = 1;
         int f = 1;
         for (int i = 2; i < N; i++) {
                 f = f0 + f1;
                 f0 = f1;
                 f1 = f;
                 System.out.println(f1);

         }

     }


}
