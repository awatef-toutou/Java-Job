package BouclesTableaux;

public class ex27 {
    public static void main(String[] args)
    {
      compare();
    }
//il faut refaire il y a une erreur sur les index je dois changer les bou
    static void compare() {
        int[] Tab1 = {12, 5, 34, 98, 1, 0, 45};
        int[] Tab2 = {12, 34, 5, 98, 1, 0, 45};
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