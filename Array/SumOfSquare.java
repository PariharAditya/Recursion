package Array;

public class SumOfSquare {
    public static void main(String[] args) {

        int[] array = { 2,7,1,19,18,3 };
        
        System.out.println(sumOfSquares(array)); 
    }

    private static int sumOfSquares(int[] nums) {
        int n = nums.length;
        return helper(nums, n, 0, 0);
    }

    private static int helper(int[] nums, int n, int index, int sum) {
        if (index == nums.length) {
            return sum;
        }
    
        if ((n % (index+1)) == 0) {
            sum += nums[index] * nums[index];
        }
    
        return helper(nums, n, index + 1, sum);
    }
}
