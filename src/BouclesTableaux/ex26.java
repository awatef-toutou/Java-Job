package BouclesTableaux;

public class ex26 {
    public static void main(String[] args)
    {
     notes();
    }
    static void notes()
    {
        double [] Tab = {6.5,19,12,15.75,11,16,4,7,14,17.25};
        int count16=0;
        int count12=0;
        int count10=0;
        int countunder10=0;
        int i=0;
        while (i< Tab.length)
        {
            if(Tab[i]<10)
            {countunder10++;}
            if((Tab[i]>=10)&&(Tab[i]<12))
            {count10++;}
            if((Tab[i]>=12)&&(Tab[i]<16))
            {count12++;}
            if(Tab[i]>=16)
            {count16++;}
            i++;
        }
        System.out.println("student have failure: "+countunder10);
        System.out.println("student have passable mention: "+count10);
        System.out.println("student have good mention: "+count12);
        System.out.println("student have very good mention: "+count16);

        }

}
