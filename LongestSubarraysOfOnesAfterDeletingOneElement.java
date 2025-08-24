public class LongestSubarraysOfOnesAfterDeletingOneElement{
    public static void main(String[] args){
        int[] nums = {1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
    public static int longestSubarray(int[] nums) {
        int oneCount = 0;
        int zeroCount = 0;
        int i = 0;
        int temp = 0;
        for(int j = 0; j < nums.length; j++){
            if(zeroCount <= 1){
                if(nums[j]==1){
                    temp++;
                }
                else{
                    zeroCount++;
                }
                if(temp > oneCount){
                    oneCount = temp;
                }
                if(zeroCount>1){
                    j--;
                }
            }
            else{
                while(zeroCount > 1){
                    if(nums[i]==1){
                        temp--;
                    }
                    else{
                        zeroCount--;
                    }
                    i++;
                }
            }
        }
        if(oneCount==nums.length){
            return oneCount-1;
        }
        return oneCount;
    }
}