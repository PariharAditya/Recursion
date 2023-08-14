public class findWinner {
    public static void main(String[] args) {
        System.out.println(findTheWinner(5, 2));
    }

    static int findTheWinner(int n, int k) {
        if (n == 1) {
            return 1;
        }

        int prevWinner = findTheWinner(n - 1, k);
        int currentWinner = (prevWinner + k - 1) % n + 1;

        return currentWinner;
    }
}
