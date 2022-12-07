public class P2 {
    public static void main(String[] args) {
        int cap = 4000000;
        int prev = 0;
        int curr = 1;
        int next;
        int total = 0;
        while (curr < cap) {
            next = prev + curr;
            prev = curr;
            curr = next;
            if (curr % 2 == 0) {
                total += curr;
            }
        }
        System.out.println(total);
    }
}
