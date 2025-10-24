import java.util.Arrays;
public class MoveZeros{
    public static void main(String[] args){
        int[] nums = {1,0,2,0,5,7,9,0};
        sol(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sol(int[] nums){
        int i = 0;
        int j = 0;
        while(j < nums.length){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        while(i < nums.length){
            nums[i++] = 0;
        }
    }
}