import java.util.HashMap;

public class LongestHarmoniousSubsequence {
    public static void main(String[] args){
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int res = 0;
        for(int key : map.keySet()){
            if(map.containsKey(key + 1)){
                if(res < map.get(key)+map.get(key+1)){
                    res = map.get(key)+map.get(key+1);
                }
            }
        }
        return res;
    }
}
