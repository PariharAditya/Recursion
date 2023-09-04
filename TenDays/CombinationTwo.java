package TenDays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationTwo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(1);
        arr.add(2);
        arr.add(7);
        arr.add(6);
        arr.add(1);
        arr.add(5);
        int target = 8;
        System.out.println(comb(arr, 3, target));

    }

    static ArrayList<ArrayList<Integer>> comb(ArrayList<Integer> arr, int n, int target) {
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        backtrack(ans, arr, new ArrayList<>(), n, target, 0);
        return ans;
    }

    static void backtrack(ArrayList<ArrayList<Integer>> result, List<Integer> arr, List<Integer> temp, int n,
            int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(temp));
        }

        /*
         * i > start: This part of the condition ensures that we are not comparing the
         * current element arr.get(i) with the previous element when i is at its initial
         * value, which is start
         */

        for (int i = start; i < arr.size(); i++) {
            if (i > start && arr.get(i) == arr.get(i - 1)) {
                continue; // skipping the iteration 
            }
            /*
             * arr.get(i) == arr.get(i-1): This part checks if the current element
             * arr.get(i) is equal to the previous element arr.get(i-1) in the sorted array.
             * In other words, it checks if the current element is a duplicate of the
             * previous element.
             * 
             * continue;: If both conditions are met (i.e., i is greater than start, and the
             * current element is a duplicate of the previous element), the continue
             * statement is executed. This means that the current iteration of the loop is
             * skipped, and we move to the next iteration. In other words, we skip adding
             * the duplicate element to the combination.
             */

            temp.add(arr.get(i));
            backtrack(result, arr, temp, n, target - arr.get(i), i + 1);
            temp.remove(temp.size() - 1);
        }
    }

}
