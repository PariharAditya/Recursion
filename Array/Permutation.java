package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        System.out.println(permute(array));

    }

    static List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, nums, new ArrayList<>());

        return ans;
    }

    static void backtrack(List<List<Integer>> list, int[] array, List<Integer> templist) {
        if (templist.size() == array.length) {
            list.add(new ArrayList<>(templist));
        } else {
            for (int i = 0; i < array.length; i++) {
                
                if (templist.contains(array[i]))
                    continue;

                templist.add(array[i]);
                backtrack(list, array, templist);
                templist.remove(templist.size() - 1);
            }
        }
    }
}
