import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class CombinationSumTwo{
    public static void main(String[] args){
        CombinationSumTwo obj = new CombinationSumTwo();
        int[] nums = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> lists = obj.combinationSum2(nums, target);
        System.out.println(lists);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        return sol(candidates, new ArrayList<Integer>(), target, 0);
    }
    public List<List<Integer>> sol(int[] nums, List<Integer> list, int target, int index){
        if(index == nums.length|| target <= 0){
            List<List<Integer>> lists = new ArrayList<>();
            if(target == 0){
                List<Integer> newList = new ArrayList<>(list);
                lists.add(newList);
            }
            return lists;
        }
        list.add(nums[index]);
        List<List<Integer>> res = sol(nums, list, target-nums[index], index+1);
        list.remove(list.size()-1);

        int next = index+1;
        while(next < nums.length && nums[next] == nums[index]){
            next++;
        }

        List<List<Integer>> res2 = sol(nums, list, target, next);
        res.addAll(res2);
        return res;
    }
}