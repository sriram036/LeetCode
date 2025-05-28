import java.util.List;
import java.util.ArrayList;
public class PermutationsTwo{
    public static void main(String[] args){
        int[] nums = {1, 3, 2};
        List<List<Integer>> lists = permuteUnique(nums);
        for(List<Integer> list : lists){
            System.out.println(list);
        }
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
        List<Integer> newList = new ArrayList<>();
        // newList.addAll(list);
        permuteUniqueRecursion(newList, lists, list);
        return lists;
    }
    public static void permuteUniqueRecursion(List<Integer> list, List<List<Integer>> lists, List<Integer> newList){
        if(newList.size()==0){
            if(!lists.contains(list)){
                lists.add(list);
            }
            return;
        }
        for(int i = 0;i < newList.size(); i++){
            List<Integer> tempNew = new ArrayList<>();
            tempNew.addAll(list);
            tempNew.add(newList.get(i));
            List<Integer> temp = new ArrayList<>();
            temp.addAll(newList);
            temp.remove(i);
            permuteUniqueRecursion(tempNew, lists, temp);
        }
    }
}