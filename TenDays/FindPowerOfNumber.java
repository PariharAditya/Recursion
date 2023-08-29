package TenDays;

public class FindPowerOfNumber {

    public static void main(String[] args) {
        System.out.println(power(5, 2));
    }
    static int power(int X, int N) {
        if (N == 0) {
            return 1;
        }
        if (X == 0) {
            return 0;
        }
        
        return X*power(X, N-1);
    }

}