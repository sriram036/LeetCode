import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class FindSubsequenceOfLengthKWithTheLargestSum{
    public static void main(String[] args){
        int[] nums= {2,1,3,3};
        int k = 2;
        System.out.println(Arrays.toString(maxSubsequence(nums,k)));
    }
    public static int[] maxSubsequence(int[] nums, int k) {
        int[] res = new int[k];
        List<Integer> list = new ArrayList<Integer>();
        int[] originalNums = new int[nums.length];
        for(int i = 0; i < nums.length;i++){
            originalNums[i] = nums[i];
        }
        Arrays.sort(nums);
        int count = 0;
        for(int i = nums.length-k; i < nums.length; i++){
            list.add(nums[i]);
        }
        for(int i = 0;i < originalNums.length; i++){
            if(list.contains(originalNums[i])){
                res[count++]=originalNums[i];
                list.remove(new Integer(originalNums[i]));
            }
        }
        return res;
    }
}