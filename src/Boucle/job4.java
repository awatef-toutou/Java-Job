package Boucle;

public class job4 {
    static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FRIBUZZ" + " ");
            } else if (i % 3 == 0) {
                System.out.println("FRIZ" + " ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ" + " ");
            }
            else{
                System.out.println(i);
            }
        }

    }
    }

