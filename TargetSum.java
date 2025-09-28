public class TargetSum{
    static Integer[][] dp;
    static int total;
    public static void main(String[] args){
        int[] nums = {1,1,1,1,1};
        int target = 3;
        TargetSum t = new TargetSum();
        System.out.println(t.findTargetSumWays(nums, target));
    }
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for(int num : nums){
            total += num;
        }
        this.total = total;
        dp = new Integer[nums.length][2*total+1];
        return findTarget(nums, target, 0, 0);
    }
    public int findTarget(int[] nums, int target, int sum, int index){
        if(index == nums.length){
            return target == sum ? 1 : 0;
        }
        if(dp[index][sum+this.total] != null){
            return dp[index][sum+this.total];
        }
        int total = findTarget(nums, target, sum+nums[index], index+1)+ findTarget(nums, target, sum-nums[index], index+1);
        dp[index][sum+this.total] = total;
        return total;
    }
}