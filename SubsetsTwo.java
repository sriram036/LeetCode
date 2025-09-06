import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class SubsetsTwo{
    public static void main(String[] args){
        int[] nums = new int[]{1,2,2};
        List<List<Integer>> lists = subsetsWithDup(nums);
        System.out.println(lists);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        subsetRecur(nums,lists, new ArrayList<Integer>());
        return lists;
    }
    public static void subsetRecur(int[] nums, List<List<Integer>> lists, List<Integer> list){
        if(nums.length == 0){
            // Collections.sort(list);
            if(!lists.contains(list)){
                lists.add(new ArrayList<>(list));
            }
            return;
        }
        int[] temp = new int[nums.length-1];
        for(int i = 0;i < nums.length-1; i++){
            temp[i] = nums[i+1];
        }
        subsetRecur(temp, lists, new ArrayList<>(list));
        list.add(nums[0]);
        subsetRecur(temp, lists, new ArrayList<>(list));
    }
}