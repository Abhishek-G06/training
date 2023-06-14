//import java.util.*;  use for user input

public class SumofEvenOdd {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in); used for users answers not for testing here
        // int[] numbers = sc.nextInt();
        int[] numbers = {2, 4, 6, 7, -1, 3, 6};

        int evenSum = 0;
        int oddSum = 0;

        for (int n : numbers) {
            if (n % 2 == 0) {
                evenSum += n; // Add even number to evenSum
            } else {
                oddSum += n; // Add odd number to oddSum
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}