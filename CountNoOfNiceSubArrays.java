import java.util.HashMap;
public class CountNoOfNiceSubArrays{
    public static void main(String[] args){
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        System.out.println(numberOfSubarrays(nums, k));
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        int currOddCount = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 1){
                currOddCount += 1;
            }
            if(map.containsKey(currOddCount-k)){
                count += map.get(currOddCount-k);
            }
            int val = map.getOrDefault(currOddCount,0);
            map.put(currOddCount, val+1);
        }
        return count;
    }
}