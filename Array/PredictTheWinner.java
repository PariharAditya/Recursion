package Array;

public class PredictTheWinner {
    public static void main(String[] args) {
        
    }
    
    static int predictor(int[] nums, int left, int right, int n) {
        if(left == right) return nums[left];

        int playerOneScore = nums[left]-predictor(nums, left+1, right, n);
        int playerTwoScore = nums[right]-predictor(nums, left, right-1, n);

        return Math.max(playerOneScore, playerTwoScore);
    }

}
