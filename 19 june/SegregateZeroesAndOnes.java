public class SegregateZeroesAndOnes {
    public static void main(String[] args) {
        String input = "011010";
        int countZeroes = 0;
        int countOnes = 0;

        // Count the number of 0's and 1's
        for (char c : input.toCharArray()) {
            if (c == '0') {
                countZeroes++;
            } else if (c == '1') {
                countOnes++;
            }
        }

        // Construct the segregated string
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < countZeroes; i++) {
            output.append('0');
        }
        for (int i = 0; i < countOnes; i++) {
            output.append('1');
        }

        System.out.println("Output: " + output.toString());
    }
}