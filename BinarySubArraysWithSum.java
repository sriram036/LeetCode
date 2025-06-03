import java.util.HashMap;
public class BinarySubArraysWithSum{
    public static void main(String[] args){
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums, goal));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int res = 0;
        int currTotal = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            currTotal += nums[i];
            if(currTotal == goal){
                res++;
            }
            if(map.containsKey(currTotal-goal)){
                res += map.get(currTotal-goal);
            }
            map.put(currTotal, map.getOrDefault(currTotal,0)+1);
        }
        return res;
    }
}