public class JobTab4 {

    public static void main(String[] args){
      // trouver la somme des index
     String str = "Dans l'espace, personne ne vous entend crier.";
     char[] tab = str.toCharArray();
     int somme = 0;
     for(int i= 0; i< tab.length; i++)
     {
         somme=i+1;
     }
     System.out.print(+somme);
    }
}
