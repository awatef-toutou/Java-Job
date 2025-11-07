package BouclesTableaux;

public class ex5 {

    public static void main(String[] args) {
        damier((5));

    }

    static void damier(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int dam = i + j;
                if (dam % 2 == 0) {
                    System.out.print("#");
                    dam++;
                } else {
                    System.out.print("-");
                    dam++;

                }
            }
            System.out.println();
        }
    }
}

