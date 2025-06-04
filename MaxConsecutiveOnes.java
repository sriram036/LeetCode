public class MaxConsecutiveOnes{
    public static void main(String[] args){
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int temp = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]==1){
                temp++;
            }
            else{
                if(temp > res){
                    res = temp;
                }
                temp = 0;
            }
        }
        if(temp > res){
            res = temp;
        }
        return res;
    }
}