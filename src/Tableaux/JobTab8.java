package Tableaux;

public class JobTab8 {
    public static void main(String[] args) {
        // sort the array elements from smallest to largest

        int[] tab = {123, 0, 98, 171, 3, 459, 67};
        System.out.println(" Sort the Array Element from Smallest to Largest: ");

        for (int i = 0; i < tab.length; i++) { // browse the tab
            int smallest = i; //define the index i as the smallest by default
            for (int j = i + 1; j < tab.length; j++) // j the index for smallest
            {
                if (tab[j] < tab[smallest]) //we compare the smallest to the new index
                {
                    smallest = j;   // if true so the index j become the new smallest

                }
            }
            int order; // the new variable for the smallest
            order = tab[i]; //put the variable into the first tab
            tab[i]=tab[smallest]; // we define as the smallest
            tab[smallest]= order; //we attribute the value of smallest to order
            for (int x : tab) {
                System.out.print(x+" ");
            }
            System.out.println();
        }

        for (int x : tab) {
            System.out.print(x+" ");
        }


//        for(int i= 0; i<tab.length; i++) {
//            System.out.print(tab[i]+" ");
//        }


        }


}