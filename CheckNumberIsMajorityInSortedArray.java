public class CheckNumberIsMajorityInSortedArray{
    public static void main(String[] args){
        int[] nums = {2,4,5,5,5,5,5,6,6};
        int target = 5;
        System.out.println(isMajorityElement(nums, target));
    }
    public static boolean isMajorityElement(int[] nums, int target) {
        int count = 0;
        int lower = findIndex(nums, target, true);
        if(lower == -1){
            return false;
        }
        int higher = findIndex(nums, target, false);
        return (higher-lower)+1 > nums.length/2;
    }
    public static int findIndex(int[] nums, int target, boolean isLower){
        int low = 0;
        int high = nums.length-1;
        int index = -1;
        while(low < high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                index = mid;
                if(isLower){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else if(nums[mid] > target){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        if(isLower && nums[low]==target){
            index = low;
        }
        else if(!isLower && nums[high]==target){
            index = high;
        }
        return index;
    }
}