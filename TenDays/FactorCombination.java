package TenDays;

import java.util.ArrayList;
import java.util.List;

public class FactorCombination {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        backTracking(12, ans, new ArrayList<>(), 2);
        System.out.println(ans);

    }

    static void backTracking(int n, ArrayList<ArrayList<Integer>> result, List<Integer> temp, int start) {
        if (n == 1) {
            if (temp.size() > 1) {
                result.add(new ArrayList<>(temp));
            }
            return;
        }

        for (int i = start; i <= n; i++) {
            if (n % i == 0) {
                temp.add(i);
                backTracking(n / i, result, temp, i);
                temp.remove(temp.size() - 1);
            }
        }
    }
}