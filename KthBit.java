public class KthBit {
    public static void main(String[] args) {
        System.out.println(findKthGrammar(2, 2));
    }

    char findKthBit(int n, int k) {
        if (n == 1) {
            return '0';
        }

        int length = (int) Math.pow(2, n) - 1;
        if (k == (length + 1) / 2) {
            return '1';
        } else if (k < (length + 1) / 2) {
            return findKthBit(n - 1, k);
        } else {
            char prevBit = findKthBit(n - 1, length - k + 1);
            return prevBit == '0' ? '1' : '0';
        }
    }

    static int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }

        int length = 1 << (n - 1); // Calculate length as 2^(n-1)
        if (k <= length / 2) {
            return kthGrammar(n - 1, k);
        } else {
            return 1 - kthGrammar(n - 1, k - length / 2);
        }
    }

}
