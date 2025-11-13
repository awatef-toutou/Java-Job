package BouclesTableaux;

public class ex28 {
    public static void main(String[] args)
    {
     even();
    }
    static void even ()
    {
        int [] Tab ={6,19,12,15,11,16,4,7,14,17,5,3};
        System.out.println("the even number are: ");

        int size =0;
        for(int i: Tab)
        {
            if((i%2)==0)
            {
                size ++;
            }
        }
        int [] evenTab = new int[size];

        int count=0;
        for (int i : Tab){
            if((i%2)==0)
            {
                evenTab[count] =i;
                count++;
            }
        }
        for(int value : evenTab)
        {
            System.out.print(value+" ");
        }
    }
}
