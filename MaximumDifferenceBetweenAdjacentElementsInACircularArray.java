public class MaximumDifferenceBetweenAdjacentElementsInACircularArray{
    public static void main(String[] args){
        int[] nums = {-5, -10, -5};
        System.out.println(maxAdjacentDistance(nums));
    }
    public static int maxAdjacentDistance(int[] nums) {
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length-1; i++){
            int diff = Math.abs(nums[i]-nums[i+1]);
            if(res < diff){
                res = diff;
            }
        }
        int diff = Math.abs(nums[0]- nums[nums.length-1]);
        if(res < diff){
            res = diff;
        }
        return res;
    }
}