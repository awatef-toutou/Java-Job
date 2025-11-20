import java.util.ArrayList;

public class Paire {

    public static void main(String[] args) {
        int n = 0;
        int count = 0;

        while (true) {
            if (n % 2 != 0) {
                n++;
                continue;
            }
            System.out.print(n+" ");

            count++;

            if (count == 5) break;
            n++;
        }
    }
}
