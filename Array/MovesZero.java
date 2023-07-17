package Array;

import java.util.Arrays;

public class MovesZero {
    public static void main(String[] args) {
        
        int[] array = {0,1,0,3,12};
        moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }

    static void moveZeroes(int[] nums) {

        helper(nums, 0, 0);
    }

    private static void helper(int[] nums, int i, int j) {
        
        if (i==nums.length) {
            return;
        }

        if (nums[i] != 0) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
        
        helper(nums, i+1,j);
    }
}
