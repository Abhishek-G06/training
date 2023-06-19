import java.util.Arrays;

public class PairContainerElements {
    public static void main(String[] args) {
        int[] container = {100, 560, 23, 19, 53, 20};
        int n = container.length;

        Arrays.sort(container); // Sort the array in ascending order

        // Pair the elements
        for (int i = 0; i < n / 2; i++) {
            int first = container[n - i - 1]; // Largest element
            int second = container[i]; // Smallest element
            System.out.println(first + " " + second);
        }
    }
}