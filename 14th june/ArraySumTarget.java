import java.util.HashMap;

public class ArraySumTarget {
    public static void findPairs(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int sum = target - arr[i];
            if (map.containsKey(sum)) {
                System.out.println(arr[i] + " + " + sum + " = " + target);
            }
            map.put(arr[i], i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 1, 3};
        int target = 9;
        findPairs(arr, target);
    }
}