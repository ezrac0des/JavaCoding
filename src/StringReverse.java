import java.util.Arrays;

public class StringReverse {
    //Write a Java program to find out the first two max values from an array?

    //Write a Java program to demonstrate string reverse with and without StringBuffer class?
    public static void main(String[] args) {
        String str = "Ramazan";
    }

    public static void reverse1(String str) {
        int length = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {
            str += str.charAt(i);
//            System.out.println(str);
        }
        System.out.println(str.substring(length));
    }

    public static void reverse2(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
//            System.out.println(str);
        }
        System.out.println(newStr);
    }

}
