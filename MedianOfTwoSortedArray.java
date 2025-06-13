public class MedianOfTwoSortedArray{
    public static void main(String[] args){
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = merge(nums1, nums2);
        // System.out.println(Arrays.toString(nums));
        if(nums.length%2==1){
            return nums[nums.length/2];
        }
        int val1 = nums[nums.length/2];
        int val2 = nums[(nums.length/2)-1];
        return (double)(val1+val2)/2;
    }
    public static int[] merge(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int l = m+n;
        int[] nums = new int[l];
        int i= 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                nums[k] = nums1[i++];
            }
            else{
                nums[k] = nums2[j++];
            }
            k++;
        }
        while(i < nums1.length){
            nums[k++]=nums1[i++];
        }
        while(j < nums2.length){
            nums[k++]=nums2[j++];
        }
        return nums;
    }
}