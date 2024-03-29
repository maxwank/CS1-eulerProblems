import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = s.nextInt() - 2;
        int[] primes = new int[N];
        for (int i = 0; i < N; i++) {
            primes[i] = i+2;
        }
        for (int i = 0; i < N; i++) {
            if (primes[i] != -1) {
                for (int j = i; j < N; j+=primes[i]) {
                    if (i != j && primes[j] % primes[i] == 0) primes[j] = -1;
                }
            }
        }
        long sum = 0;
        for (int i = 0; i < N; i++) {
            if (primes[i] != -1) sum += primes[i];
        }
        System.out.println(sum);
    }
}
