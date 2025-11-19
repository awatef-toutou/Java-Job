package com.herit.type;


    class  GrandFather
    {
        void love(){
            System.out.println("garndfather is loving..");
        }
    }
  class Father extends GrandFather
        {
            void work(){
                System.out.println("father is working");
            }
        }

  class Child extends Father {
            void play() {
                System.out.println("child is play...");
            }
        }

public class Multilevel {
        public static void main(String[] args) {
            Child c = new Child();
            c.play();
            c.work();
            c.love();//it herit like as his father herit

        }
}
