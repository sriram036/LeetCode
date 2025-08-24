public class MaxConsecutiveOnesThree{
    public static void main(String[] args){
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
    public static int longestOnes(int[] nums, int k) {
        int oneCount = 0;
        int zeroCount = 0;
        int i = 0;
        int temp = 0;
        for(int j = 0; j < nums.length; j++){
            if(zeroCount <= k){
                if(nums[j]==1){
                    temp++;
                }
                else{
                    temp++;
                    zeroCount++;
                }
                if(zeroCount>k){
                    j--;
                    temp--;
                }
                if(temp > oneCount){
                    oneCount = temp;
                }
            }
            else{
                while(zeroCount > k){
                    if(nums[i]==1){
                        temp--;
                    }
                    else{
                        zeroCount--;
                    }
                    if(zeroCount < k){
                        temp++;
                    }
                    i++;
                }
            }
            // System.out.println(zeroCount + " " + oneCount + " " + i +" " + j);
        }
        return oneCount;
    }
}