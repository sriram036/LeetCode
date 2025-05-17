import java.util.Arrays;
public class SortColors{
    public static void main(String[] args){
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        mergeSort(nums);
    }
    public static void mergeSort(int[] nums){
        int len = nums.length;
        if(len<=1){
            return;
        }
        int mid = len/2;
        int[] left = new int[mid];
        int[] right = new int[len-mid];
        for(int i = 0; i < mid; i++){
            left[i] = nums[i];
        }
        for(int i = mid; i < len; i++){
            right[i-mid] = nums[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,nums);
    }
    public static void merge(int[] left, int[] right, int[] nums){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                nums[k] = left[i];
                i++;
            }
            else{
                nums[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            nums[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            nums[k] = right[j];
            j++;
            k++;
        }
    }
}