import java.util.Arrays;
public class MaximumProductOfATwoElementsInAnArray{
    public static void main(String[] args){
        int[] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return (nums[len-1]-1)*(nums[len-2]-1);
    }
}