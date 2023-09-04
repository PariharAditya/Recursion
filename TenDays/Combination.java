package TenDays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Combination
 */
public class Combination {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        System.out.println(combSum(array, 5));
    }

    public static List<List<Integer>> combSum(int[] ARR, int B) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(ARR);
        backtrack(ARR, B, 0, ans, new ArrayList<>());
        return ans;
    }

    static void backtrack(int[] array, int target, int start, List<List<Integer>> result, List<Integer> temp) {
        if (target == 0) {
            result.add(new ArrayList<>(temp)); // we're doing this step because we need copy our answer and backtrack
                                               // for which we're doing temp.remove() it remove
            return;
        }

        for (int i = start; i < array.length; i++) {
            if (array[i] > target) {
                continue;
            }
            temp.add(array[i]);
            backtrack(array, target - array[i], i, result, temp);
            temp.remove(temp.size() - 1);
        }
    }
}