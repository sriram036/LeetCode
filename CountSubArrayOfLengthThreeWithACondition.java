public class CountSubArrayOfLengthThreeWithACondition{
    public static void main(String[] args){
        int[] nums = {1,2,1,4,1};
        int res = countSubarrays(nums);
        System.out.println(res);
    }
    public static int countSubarrays(int[] nums) {
        int i = 0;
        int j = 2;
        int res = 0;
        while(j < nums.length){
            if(nums[i]+nums[j] == nums[i+1]/2.0){
                ++res;
            }
            i++;
            j++;
        }
        return res;
    }
}