public class ContainerWithMostWater{
    public static void main(String[] args){
        int[] nums= {1, 8, 6 , 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(nums));
    }
    public static int maxArea(int[] height) {
        int res = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            int temp = 0;
            if(height[j] <= height[i]){
                temp = (j-i)*height[j];
                j--;
            }
            else{
                temp = (j-i)*height[i];
                i++;
            }
            if(res < temp){
                res = temp;
            }
        }
        return res;
    }
}