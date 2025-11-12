package BouclesTableaux;

public class ex27 {
    public static void main(String[] args)
    {
      compare();
    }

    static void compare() {
        int[] Tab1 = {12, 34, 7, 98, 1, 0, 45};
        int[] Tab2 = {12, 34, 7, 98, 1, 0, 45};
        int count = 0;
        for (int i : Tab1) {
            for (int j : Tab2) {
                if (i == j) {
                    count++;
                }
            }
        }
        if (count == Tab1.length) {
            System.out.println("They are identical");
        } else {
            System.out.println("they are not identical");
        }

    }
}