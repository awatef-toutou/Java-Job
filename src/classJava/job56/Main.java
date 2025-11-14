package classJava.job56;

public class Main {
    public static void main(String[] args)
    {

        Voiture car = new Voiture("BMW",260);
        car.accelerer();
        car.vitesse=180;
        car.accelerer();
        Voiture car1 = new Voiture("Mercedes", 280);
        Voiture car2 = new Voiture("AUdi", 270);

        car1.display();
        car1.accelerer();
        car1.display();

        car2.display();
        car2.accelerer();
        car2.display();

    }

}
