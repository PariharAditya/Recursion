public class ThreeDivisor {
    public static void main(String[] args) {
        System.out.println(isThree(4));

        System.out.println(recursionWay(4, 1, 0));
    }

    static boolean isThree(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 3) {
            return true;
        }

        return false;
    }

    static boolean recursionWay(int n, int index, int count) {
        if (index >= n) {
            return count == 3;
        }

        if (n % index == 0) {
            count++;
        }

        return recursionWay(n, index + 1, count);
    }
}
