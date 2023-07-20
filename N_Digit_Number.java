import java.util.ArrayList;

/*
 *  A will update from B in the loop 
 *  AB a number is generated with A*10+B
 *  Keep B++ & N-- 
 */
public class N_Digit_Number {
    public static void main(String[] args) {
        System.out.println(increasingNumbers(2));
    }

    static ArrayList<Integer> increasingNumbers(int N) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (N == 1) {
            ans.add(0);
        }
        generator(N, 0, 1, ans);

        return ans;
    }

    private static void generator(int n, int i, int j, ArrayList<Integer> ans) {

        if (n == 0) {
            ans.add(i);
            return;
        }

        for (int B = j; B <= 9; B++) {
            generator(n - 1, i * 10 + B, j + 1, ans);  /*operator preference * > + */
        }
    }
}
