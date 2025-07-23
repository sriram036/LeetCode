public class MinimumSizeSubarraySum {
    public static void main(String[] args){
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int len = 0;
        int res = Integer.MAX_VALUE;
        boolean isModified = false;
        while(i < nums.length){
            if(j < nums.length && sum <= target){
                sum += nums[j];
                j += 1;
                len += 1;
            }
            else{
                if(sum >= target){
                    if(sum >= target && res > len){
                        res = len;
                        isModified = true;
                    }
                    sum -= nums[i];
                    i += 1;
                    len -= 1;
                }
                else{
                    i += 1;
                }
            }
            if(sum >= target && res > len){
                res = len;
                isModified = true;
            }
        }
        if(isModified && sum>= target && res>len){
            res = len;
        }
        return res==Integer.MAX_VALUE ? 0: res;
    }
}