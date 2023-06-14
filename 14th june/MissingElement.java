public class MissingElement {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 1, 6};

        int n = array.length + 1; 
        int expectedSum = (n * (n + 1)) / 2; 

        int actualSum = 0;
        for (int num : array) {
            actualSum += num; 
        }

        int missingElement = expectedSum - actualSum;
        System.out.println("Missing element: " + missingElement);
    }
}