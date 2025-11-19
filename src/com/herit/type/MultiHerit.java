package com.herit.type;
class Human{ //class supp elle peut pas heriter d autre class (par le contexte que l etre human
    //n'a pas de plus //on utlise les interface le plus pour les bases  de données "repositories"
    void walk()
    {
        System.out.println("human is walking");
    }
}
interface Coder{ //c une class abstracter //on peut creer l innterface comme la class sous le package
    void coding();
}


interface Dancer{
    void dancer();
}

class Person extends Human implements Coder, Dancer{//c un heritage hypride

    @Override  // on appel les methodes pour les reutiliser
    public void coding() {
        System.out.println("person is coding...");
    }

    @Override
    public void dancer() {
        System.out.println("person is dancing...");
    }
}


public class MultiHerit {
    public static void main(String[] args)
    {
        Person p = new Person();
        p.coding();
        p.dancer();
        p.walk();//heritage hybride

    }
}
