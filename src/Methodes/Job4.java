package Methodes;

public class Job4 {

    public static void main (String[] args) {
        System.out.println( calcule(7,'-',23));

    }

    static double calcule(double a, char op ,double b) {
        double result = 0;
        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '/') {
            result = a / b;
        } else if (op == '*') {
            result = a * b;

        } else {
            System.out.println("error");
        }
        return result;

    }
}














