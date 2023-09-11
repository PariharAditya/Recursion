package TenDays;

public class ProRamNumber {
    public static void main(String[] args) {
        System.out.println();

    }

    static int fxn(int i, int[] digit, int n, int index, int num) {
        if (i == index) {
            if (num <= n) {
                return 1;
            } else {
                return 0;
            }
        }
        int ans = 0;
        for (int j = 0; j < digit.length; j++) {
            ans += fxn(i, digit, n, index + 1, num * 10 + digit[i]);
        }
        return ans;
    }

    public static int possibleNumbers(int n, int m, int[] digits) {
        int d = (int) Math.log10(n) + 1;

        int ans = 0;
        for (int i = 1; i <= d; i++) {
            ans = fxn(i, digits, n, 0, 0);
        }
        return ans;
    }

}
