public class CountGoodNumber {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        System.out.println(power(0, 4));
    }

    private static long power(long base, long exp) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }
        return result;
    }
}
