package math;
import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int num, factorial = 1, i;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer");
        num = in.nextInt();

        for (i = 1; i <= num; i++){
            factorial = factorial * i;
        }

        System.out.println("!" + num + " = " + factorial);
    }
}
        
        //System.out.println("L");



