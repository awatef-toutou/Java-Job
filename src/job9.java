public class job9 {
    public static void main(String[] args) {

        int h = 5;

        for(int i=1; i<=h; i++) {
            for(int j=2*h; j>=i; j--){
                System.out.print(" ");//creer le vide de haut
            }
            for(int j=1; j<=2*i-1; j++) { //on dessine les etoiles
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=h-1; i>=1; i--) {
            for(int j=2*h; j>=i; j--){
                System.out.print(" ");//creer le vide de haut
            }
            for(int j=1; j<=2*i-1; j++) { //on dessine les etoiles
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
