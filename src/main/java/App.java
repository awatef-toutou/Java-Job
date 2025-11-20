import org.apache.commons.lang3.ArrayUtils;

public class App {
//on a rajouter une bibliotheque ArrayUtils
    public static void main(String[] args) {
    int[]arr= {1, 2, 3, 4};
    int [] arr2 = ArrayUtils.insert(0,arr,10);
        System.out.println(ArrayUtils.toString(arr2));
        ArrayUtils.reverse(arr2);//on inverse la list
        System.out.println(ArrayUtils.toString(arr2));
        boolean exists = ArrayUtils.contains(arr2,10);//je cherche la valeur 10 dans ma liste arr2
        System.out.println(exists);
        boolean isEmpty = ArrayUtils.isEmpty(arr2);
        System.out.println(isEmpty);

    }
}
