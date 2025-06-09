import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class FindAllDuplicatesInAnArray{
    public static void main(String[] args){
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i= 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                map.put(nums[i],val+1);
                list.add(nums[i]);
            }
            else{
                map.put(nums[i],1);
            }
        }
        return list;
    }
}