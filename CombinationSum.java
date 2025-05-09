import java.util.List;
import java.util.ArrayList;
public class CombinationSum{
    public static void main(String[] args){
        int[] candidates = {2,3,5};
        int target = 8;
        List<List<Integer>> lists = combinationSum(candidates, target);
        System.out.println("Ans:");
        for(List<Integer> list : lists){
            System.out.println(list);
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        combinationSumRecursion(0,candidates, lists,new ArrayList<Integer>(), target);
        return lists;
    }
    public static void combinationSumRecursion(int index, int[] candidates, List<List<Integer>> lists, List<Integer> list, int target){
        if(index == candidates.length){
            if(target==0){
                lists.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[index] <= target){
            list.add(candidates[index]);
            combinationSumRecursion(index, candidates, lists, list, target-candidates[index]);
            list.remove(list.size()-1);
        }
        combinationSumRecursion(index+1,candidates, lists, list, target);
    }
}