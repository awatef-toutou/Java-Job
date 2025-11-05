package Methodes;

public class Job7 {


    public static String gras(String str) {

        String sorti = "";
        String[] array = str.split(" ");
        for (String word : array) {
            char[] charWord = word.toCharArray();
            for (char upperCase : charWord) {
                if (Character.isUpperCase(upperCase)) {
                    sorti += ("*" + word + "*");
                    break;
                }
                sorti += word;
                break;
            }
            sorti += " ";
        }
        return sorti;
    }

    static String cesar(String str, int n) {

        String result = " ";
        char[] tab = str.toCharArray();
        char a = ' ';
        for (int i : tab) {
            i = i + n;
            if(i>=90)
            {
                i= i-25;
            }
            a = (char) i; // inversé l entier en un caratere
            result += a;
        }
        return result;
    }


//    static String plateforme(String str) {
//        String[] tab = str.split(" ");
//        for (String word : tab) {
//            char[] charWord = word.toCharArray();
//            for (char me : charWord)
//            {
//                if (word == "me")
//                {
//
//                }
//            }

//        }
//
//
//    }

    public static void main(String[] args){
        System.out.println(gras("Maj pazzz test"));
        System.out.println(cesar("a",3));

    }
}
 // le travail à moi
//    String sorti="";
//    char[] tab = str.toCharArray();
//        for(char i : tab )
//    {
//        if (Character.isUpperCase(i))
//        {
//            sorti += "*" + i;
//        }
//        else if(i ==' ') {
//            {
//                sorti += "*"+i;
//                break;
//            }
//        }
//        else {
//            sorti += i;
//        }
//    }
//
//        return sorti;
//}