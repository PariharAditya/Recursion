package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        System.out.println(combinationSum2(nums, 8));

    }
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> answList = new ArrayList<>();
        backtrack(answList, new ArrayList<>(), candidates, 0, target);
        return answList;
    }

    static void backtrack(List<List<Integer>> answer, List<Integer> temp, int[] nums, int start, int target) {
        if (target < 0) {
            return;
        }
        else if (target == 0) {
            answer.add(new ArrayList<>(temp));
        } else {
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i-1]) {
                    continue;
                }
                temp.add(nums[i]);
                backtrack(answer, temp, nums, i+1, target-nums[i]);
                temp.remove(temp.size()-1);
            }
        }
    }
}
