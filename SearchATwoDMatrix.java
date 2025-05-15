public class SearchATwoDMatrix{
    public static void main(String[] args){
        int[][] matrix = {{1}};
        int target = 1;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int[] nums : matrix){
            if(binarySearch(nums,target)){
                return true;
            }
        }
        return false;
    }
    public static boolean binarySearch(int[] nums, int target){
        int i = 0;
        int j = nums.length-1;
        while(i <= j){
            int mid = i + (j-i) / 2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid] > target){
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return false;
    }
}