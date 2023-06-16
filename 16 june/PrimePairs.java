import java.util.ArrayList;
import java.util.List;

public class PrimePairs {

    public static void main(String[] args) {
        int m = 4;
        int n = 30;
        int count = countPrimePairs(m, n);
        System.out.println("Count of prime pairs: " + count);
    }

    public static int countPrimePairs(int m, int n) {
        int count = 0;
        List<Integer> primes = generatePrimes(n);
        
        for (int i = 0; i < primes.size() - 1; i++) {
            int current = primes.get(i);
            int next = primes.get(i + 1);
            
            if (current >= m && current + 6 == next) {
                System.out.println("(" + current + "," + next + ")");
                count++;
            }
        }
        
        return count;
    }

    public static List<Integer> generatePrimes(int n) {
        boolean[] isComposite = new boolean[n + 1];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                primes.add(i);
                for (int j = 2 * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        
        return primes;
    }
}