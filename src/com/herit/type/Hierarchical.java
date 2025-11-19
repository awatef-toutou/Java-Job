package com.herit.type;


class Parent {
    void property(){
        System.out.println("parent's property...");
    }
}


 class Child1 extends Parent
 {
     void  child1property()
     {
         System.out.println("child1's property...");
     }
 }


class Child2 extends Parent
{
    void  child2property()
    {
        System.out.println("child2's property...");
    }
}





public class Hierarchical {
    public static void main(String[] args)
    {
        Child1 c1 = new Child1();
        c1.property();
        c1.child1property();

        Child2 c2 = new Child2();
        c2.property();
        c2.child2property();

    }
}
