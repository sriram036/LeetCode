import java.util.HashMap;

public class MaximumErasureValue {
    public static void main(String[] args){
        int[] nums = {4, 2, 4, 5, 6};
        System.out.println(maximumUniqueSubarray(nums));
    }
    public static int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int sum = 0;
        int temp = 0;
        while(j < nums.length){
            if(!map.containsKey(nums[j])){
                map.put(nums[j],1);
                temp += nums[j];
                j += 1;
                
            }
            else{
                if(sum < temp){
                    sum = temp;
                }
                temp -= nums[i];
                map.remove(nums[i]);
                i += 1;

            }
            // System.out.println(sum);
        }
        if(sum < temp){
            sum = temp;
        }
        return sum;
    }
}
