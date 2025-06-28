import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllKDistantIndicesInAnArray {
    public static void main(String[] args){
        int[] nums = {3, 4, 9, 1, 3, 9, 5};
        int key = 9;
        int k = 1;
        System.out.println(findKDistantIndices(nums, key, k));
    }
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(Math.abs(i-j)<=k && nums[j]==key && !map.containsKey(i)){
                    list.add(i);
                    map.put(i, 1);
                }
            }
        }
        return list;
    }
}
