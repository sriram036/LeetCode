import java.util.HashMap;
public class LargestUniqueNumber{
    public static void main(String[] args){
        int[] nums = {9,9,8,8};
        System.out.println(largestUniqueNumber(nums));
    }
    public static int largestUniqueNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int res = -1;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                if(res < key){
                    res = key;
                }
            }
        }
        return res;
    }
}