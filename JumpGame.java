public class JumpGame{
    int[] nums;
    Boolean[] dp;
    public static void main(String[] args){
        int[] nums = {2,3,1,1,4};
        JumpGame obj = new JumpGame();
        System.out.println(obj.canJump(nums));
    }
    public boolean canJump(int[] nums) {
        this.nums = nums;
        this.dp = new Boolean[10001];
        return sol(0);
    }
    public boolean sol(int index){
        if(index >= nums.length){
            return false;
        }
        if(index == nums.length-1){
            return true;
        }
        if(dp[index] != null){
            return dp[index];
        }
        boolean canJump = false;
        for(int i = nums[index]; i > 0; i--){
            canJump = sol(index+i);
            if(canJump){
                break;
            }
        }
        return dp[index] = canJump;
    }
}