import java.util.Arrays;
public class NextPermutation{
    public static void main(String[] args){
        NextPermutation obj = new NextPermutation();
        int[] nums = {1,2,3};
        System.out.println("Before");
        System.out.println(Arrays.toString(nums));
        obj.nextPermutation(nums);
        System.out.println("After");
        System.out.println(Arrays.toString(nums));
    }
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i >= 0 && nums[i+1] <= nums[i]){
            i--;
        }
        if(i >= 0){
            int j = nums.length-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(i, j, nums);
        }
        reverse(i+1, nums);
    }
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int i, int[] nums){
        int j = nums.length-1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}