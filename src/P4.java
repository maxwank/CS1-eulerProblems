public class P4 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int mult1 = 0;
        int mult2 = 0;
        int product;
        int[] digits = new int[1];
        int greatest = 0;
        for (int i = 100; i < 1000; i++) {
            num1 = i;
            for (int j = 100; j < 1000; j++) {
                num2 = j;
                product = num1 * num2;
                int num = product;
                digits = Integer.toString(num).chars().map(c -> c - '0').toArray();
                reverse(digits);
                isPalindrome(digits);
                if (isPalindrome(digits)) {
                    if (greatest < product){
                        greatest = product;
                        mult1=i;
                        mult2=j;
                    }
                }
            }
        }
        System.out.println("The greatest is palindrome in the sequence is " + greatest + ". Using numbers " + mult1 + " and " + mult2 );
    }
    public static int[] reverse(int[] digits) {
        int n = digits.length;
        int k = 0;
        while (k < n / 2) {
            int temp = digits[k];
            digits[k] = digits[n - k - 1];
            digits[n - k - 1] = temp;
            k = k + 1;
        }
        return digits;
    }
    public static boolean isPalindrome(int[] digits) {
        boolean isPalindrome = true;
        for (int i = 0; i < digits.length / 2; i++) {
            if (digits[i] != digits[digits.length - 1 - i]) {
                return false;
            }
        }
        return isPalindrome;
    }
}
