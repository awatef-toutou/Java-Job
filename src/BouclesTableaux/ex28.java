package BouclesTableaux;

public class ex28 {
    public static void main(String[] args)
    {
     even();
    }
    static void even ()
    {
        int [] Tab ={6,19,12,15,11,16,4,7,14,17,5,3};
        int [] evenTab = new int[Tab.length];
        System.out.println("the even number are: ");
        for (int i=0; i< Tab.length;i++)
        {
            if (Tab[i]%2==0)
            {
                evenTab[i]=Tab[i];
                System.out.print(evenTab[i]+" | ");
            }

        }

    }
}
