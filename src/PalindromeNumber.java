import java.util.ArrayList;

/**
 * How to find a number is Palindrome or not?
 *
 * @author ezra
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        Integer num = 10001;

    }

    public static boolean isPalindrome1(int x) {
        boolean result = false;
        ArrayList<Integer> num = new ArrayList<Integer>();
        int a = x;
        if (x < 0) {
            return false;
        }
        int i = 0;
        while (x >= 10) {
            num.add(x % 10);
            x = x / 10;
            i++;
        }
        num.add(x % 10);

        int start = 0;
        int end = num.size() - 1;

        while (start <= end) {
            if (num.get(start) == num.get(end)) {
                result = true;
                end--;
                start++;
            } else return false;
        }
        return result;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }


    public static void palindrome3(Integer num) {
        int start = 0;
        boolean flag = true;
        int end = num.toString().length() - 1;
        for (int i = 0; i < num.toString().length(); i++) {
            if (num.toString().charAt(start) == num.toString().charAt(end)) {
                start++;
                end--;
                if (i == num.toString().length() - 1) {
                    flag = true;
                }
            }
        }
        System.out.println(flag);
    }

    public static void palindrome2(int num) {
        int constNum = num;
        int temp = 0;
        while (num > 0) {
            constNum = num % 10;
            num = num / 10;
            temp = (temp * 10) + constNum;
        }
        System.out.println(temp);
        System.out.println();
    }

    public static void palindrome1(int num) {
        StringBuilder strr = new StringBuilder(String.valueOf(num));
        System.out.println(strr.reverse());
    }

    public static void palindrome(int num) {
        String numStr = String.valueOf(num);
        String str = "";

        for (int i = numStr.length() - 1; i >= 0; i--) {
            str += numStr.charAt(i);
        }
        System.out.println(str);
        if (Integer.valueOf(str) == num) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
