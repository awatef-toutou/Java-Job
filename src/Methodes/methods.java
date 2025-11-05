package Methodes;

public class methods {

    public static void main(String[] args)
    {
        String [] prenoms ={ "awatef" ,"eya"};
        int [] tab = {13,3,56,0,4,1};
        int[][] notesClasse= {{12,4,10},{7,11,16},{1,14,0}};
        methods.afficheMessage(); // call of methods
        methods.afficheMessage("alice", 14);

        methods.afficheTab(prenoms);
        methods.afficheMessage();
        int addition= methods.additionner(5,3);
        System.out.println(addition);
        System.out.println(methods.averrage(tab));
    }


    static void afficheMessage(){ //declare a methods & don't return any things
        System.out.println("hello");
        System.out.println("word");

    }

    static void afficheMessage(String str , int age){
        System.out.println("hello " +str +" "+age+ "ans");

    }
    static void afficheTab (String [] prenoms)
    {
        for(String prenom : prenoms)
        {
            System.out.println(prenom);
        }
    }

    static int additionner(int x , int y) {
        int result = x+y;
        if(result<10)
        {
            return result; // this return don't stop
        }
        return 0; // in any case we must define the return for methods
    }

    static double averrage(int [] numbers) {
        double total = 0;
        for( double number : numbers)
        {
            total+= number;
        }
        return total/numbers.length;

    }






    }






