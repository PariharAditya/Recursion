package Array;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums, 0);
        return ans;        
    }

    static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] array, int start) {

        list.add(new ArrayList<>(tempList));
        for (int i = start; i < array.length; i++) {
            tempList.add(array[i]);
            backtrack(list, tempList, array, start+1);
            tempList.remove(tempList.size()-1);        
        }

    }
}
