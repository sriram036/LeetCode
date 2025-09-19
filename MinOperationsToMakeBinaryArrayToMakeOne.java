public class MinOperationsToMakeBinaryArrayToMakeOne{
    public static void main(String[] args){
        int[] nums = {0, 1, 1, 1, 0, 0};
        System.out.println(minOperations(nums));
    }
    public static int minOperations(int[] nums) {
        int noOfOperations = 0;
        int n = nums.length;
        for(int i = 0; i <= n-3; i++){
            if(nums[i]==0){
                nums[i] = 1;
                if(nums[i+1] == 1){
                    nums[i+1] = 0;
                }
                else{
                    nums[i+1] = 1;
                }
                if(nums[i+2] == 1){
                    nums[i+2] = 0;
                }
                else{
                    nums[i+2] = 1;
                }
                noOfOperations++;
            }
        }
        // System.out.println(Arrays.toString(nums));
        if(nums[n-1] == 1 && nums[n-2] == 1 && nums[n-3] == 1){
            return noOfOperations;
        }
        return -1;
    }
}