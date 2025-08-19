public class ArithmeticSlices{
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        System.out.println(numberOfArithmeticSlices(nums));
    }
    public static int numberOfArithmeticSlices(int[] nums) {
        int total = 0;
        if(nums.length < 3){
            return 0;
        }
        for(int i = 0; i < nums.length-2; i++){
            int diff = nums[i+1] - nums[i];
            for(int j = i+2; j < nums.length; j++){
                if(nums[j]-nums[j-1]!=diff){
                    break;
                }
                total++;
            }
        }
        return total;
    }
}