import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
        public static void main(String[] args) {

            Random rand = new Random();
            Scanner scanner=new Scanner(System.in);  // to take input from user.

            // generates a number between 0 and 9, so we add 1 to get a number between 1 and 10
            int randomNumber = rand.nextInt(10) + 1;
            System.out.println("Keep a number between 1-10 in your mind. And please enter this number.");
            int number =scanner.nextInt();
            System.out.println("Random number: " + randomNumber);
            if(randomNumber==number){
                System.out.println("Congratulation !!.It is correct answer");
            }else{
                System.out.println("So sorry .It is wrong answer");
            }
        }
    }

