package tester;

public class Main {
    public static void main(String[] args)
    {
        Chaise ch1  = new Chaise(12, "noir",1.5);
        ch1.display();
        ch1.setColor("bleu");
        ch1.display();
        System.out.println(ch1.getCouleur());

        Chaise.NewChaise inner = new Chaise.NewChaise(); //utiliser une class inner encapsulation
        inner.displaynb();

    }
}
