public class PartitionEqualSubsetSum{
    static Boolean[][] dp = new Boolean[200][10001];
    public static void main(String[] args){
        int[] nums = {1, 5, 11, 5};
        System.out.println(canPartition(nums));
    }
    public static boolean canPartition(int[] nums) {
        int total = 0;
        for(int num : nums){
            total += num;
        }
        if(total%2 != 0){
            return false;
        }
        return canPartition(0, total/2, nums);
    }
    public static boolean canPartition(int index, int target, int[] nums){
        if(target < 0){
            return false;
        }
        if(index == nums.length){
            return target == 0;
        }
        if(dp[index][target] != null){
            return dp[index][target];
        }
        boolean res = canPartition(index+1, target-nums[index], nums)|| canPartition(index+1, target, nums);
        dp[index][target] = res;
        return res;

    }
}