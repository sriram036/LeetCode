import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;;
class ThrSum{
    public static void main(String[] args){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        for(List<Integer> list : lists){
            System.out.println(list);
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) if (dups.add(nums[i])) {
            for (int j = i + 1; j < nums.length; ++j) {
                int complement = -nums[i] - nums[j];
                if (seen.containsKey(complement) && seen.get(complement) == i) {
                    List<Integer> triplet = Arrays.asList(
                        nums[i],
                        nums[j],
                        complement
                    );
                    Collections.sort(triplet);
                    res.add(triplet);
                }
                seen.put(nums[j], i);
            }
        }
        return new ArrayList<>(res);
    }
}