public class CountHillValley{
    public static void main(String[] args){
        int[] nums = {2, 4, 1, 1, 6, 5};
        System.out.println(countHillValley(nums));
    }
    public static int countHillValley(int[] nums) {
        int count = 0;
        for(int i = 1;i < nums.length-1; i++){
            int j =  i+1;
            int temp = 0;
            while(j < nums.length && nums[j] == nums[i]){
                temp++;
                j += 1;
            }
            // System.out.println(i + " " + j);
            if(j < nums.length && ((nums[i] > nums[i-1] && nums[i]>nums[j])||(nums[i] < nums[i-1] && nums[i]<nums[j]))){
                count++;
            }
            i += temp;
        }
        return count;
    }
}