public class MaximumDifferenceBetweenIncreasingElements{
    public static void main(String[] args){
        int[] nums = {7, 1, 5 ,4};
        System.out.println(maximumDifference(nums));
    }
    public static int maximumDifference(int[] nums) {
        int res = Integer.MIN_VALUE;
        boolean isChanged = false;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] < nums[j] && res < nums[j]-nums[i]){
                    res = nums[j]-nums[i];
                    isChanged = true;
                }
            }
        }
        if(isChanged){
            return res;
        }
        return -1;
    }
}