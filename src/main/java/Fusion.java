import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fusion {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,5,10,12));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2,24,10,12));
        ArrayList<Integer> list = new ArrayList<>(List.copyOf(list1));
       for (Integer n : list2)
       {
           if (list.contains((n)))
           {
               list.add(n);
           }
       }
        System.out.println(list);
    }
}
