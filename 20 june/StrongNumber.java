public class StrongNumber {
    public static void main(String[] args) {
        int number = 145;
        
        if (isStrongNumber(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }


    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }

        return originalNumber == sumOfFactorials;
    }

    public static int factorial(int number) {
    int result = 1;

    for (int i = 2; i <= number; i++) {
        result *= i;
    }

    return result;
    }

    /* 
    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
    */
}
