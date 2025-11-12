package classJava;

public class Main {

    public static void main(String[] args)
    {
        Marque M1  = new Marque("M3 G81");//create an instance of the class Marque
        M1.display(); //apply the method display to the object M1
        Constructor C = new Constructor("BMW");
        C.display();
        Personne P= new Personne(20, "lea", "dupont",1.65, "fille","nice");
        P.displayville();
    }
}


