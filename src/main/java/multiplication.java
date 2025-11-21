import javax.swing.plaf.synth.SynthOptionPaneUI;

public class multiplication {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print( (i * j)+"\t"); // \t pour faire tabulation entre les resultat
            }
            System.out.println();
        }
    }
}
//
//version whle
//int i=1;
//while(i<10)
//{
//int j=0;
//while(j<=10)
//{
//j++;
// }
//i++;
//System.out.print( (i * j)+"\t");
//}
