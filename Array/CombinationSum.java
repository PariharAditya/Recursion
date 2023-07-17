package Array;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7 };
        sum(arr, 7, 0);
        System.out.println(sum(arr, 7, 0));
    }

    static List<List<Integer>> sum(int[] array, int target, int index) {
        List<List<Integer>> result = new ArrayList<>();

        if (index == array.length) {
            if (target == 0) {
                result.add(new ArrayList<>());
            }
            return result;
        }

        if (array[index] <= target) {
            List<List<Integer>> combinations = sum(array, target - array[index], index);

            for (List<Integer> combination : combinations) {
                combination.add(array[index]);
                result.add(combination);
            }
        }

        result.addAll(sum(array, target, index + 1));

        return result;
    }
}
