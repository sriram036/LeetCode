public class LongestIncreasingSubsequence{
    Integer[][] dp;
    public static void main(String[] args){
        int[] nums = {0,1,0,3,2,3};
        LongestIncreasingSubsequence obj = new LongestIncreasingSubsequence();
        System.out.println(obj.lengthOfLIS(nums));
    }
    public int lengthOfLIS(int[] nums) {
        dp = new Integer[nums.length][nums.length+1];
        return lengthOfLTS(nums, 0, -1);
    }
    public int lengthOfLTS(int[] nums, int curr, int prev){
        if(curr == nums.length){
            return 0;
        }
        if(dp[curr][prev+1] != null){
            return dp[curr][prev+1];
        }
        int exclude = lengthOfLTS(nums, curr+1, prev);
        int include = 0;
        if(prev == -1 || nums[prev] < nums[curr]){
            include = 1 + lengthOfLTS(nums, curr+1, curr);
        }
        return dp[curr][prev+1] = Math.max(include, exclude);
    }
}