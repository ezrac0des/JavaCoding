import java.io.File;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number ");
        int num = scanner.nextInt();
        System.out.println(fib(num));
        System.out.println(fib2(num));

    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n >= 3) {
            int result=fib(n - 1) + fib(n - 2);
            System.out.println(result);
            return result;
        } else {
            return 1;
        }


    }
    public static int  fib2(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int  firstNumber=0;
        int lastNumber=1;
        int sum=0;
        while(n>1){
            sum=firstNumber+lastNumber;
            firstNumber=lastNumber;
            lastNumber=sum;
            n--;
        }
        System.out.println(sum);
        return sum;
    }
}
