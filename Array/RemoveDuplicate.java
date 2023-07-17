package Array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(helper(nums, 1, 1));
    }
    static int helper(int[] array, int i, int count) {
        if (i==array.length) {
            return count;
        }

        if (array[i]!=array[i-1]) {
            array[count++] = array[i];
        }

        return helper(array, i+1, count);
    }    
}