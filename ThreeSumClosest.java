public class ThreeSumClosest {
    public static void main(String[] args){
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
    public static int threeSumClosest(int[] nums, int target) {
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(Math.abs(sum - target) < Math.abs(res - target)){
                        res = sum;
                    }
                }
            }
        }
        return res;
    }
}
