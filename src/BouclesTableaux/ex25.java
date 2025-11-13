package BouclesTableaux;

public class ex25 {
    public static void main(String[] args)
    {
        temperature();;
    }
    static void temperature()
    {
        int [] Tab = {23,6,8,39,20,29,42};
        int tmoy;
        int somme=0;
        for (int i : Tab)
        {
            somme = somme +i;
        }
        tmoy = somme/ Tab.length;
        System.out.println("the average is: "+tmoy);

        int coldest =Tab[0];
        for (int j : Tab) {
            if (j < coldest)
            {
                coldest = j;
            }
        }
        System.out.println("the coldest is :"+coldest);

        int hottest =Tab[0];
        for (int j : Tab) {
            if (j > hottest)
            {
                hottest = j;
            }
        }
        System.out.println("the hottest is :"+hottest);


    }
}
