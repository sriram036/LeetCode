public class MaximumAverageSubArrayOne{
    public static void main(String[] args){
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double average = -2147483648;//Double.MIN_VALUE;
        int i = 0;
        int j = i+k;
        int[] prefixSum = new int[nums.length];
        int sum = 0;
        for(int l = 0; l < nums.length; l++){
            sum += nums[l];
            prefixSum[l] = sum;
        }
        while(i<=nums.length-k){
            double temp = 0;
            if(i==0){
                temp = prefixSum[j-1];
            }
            else{
                temp = prefixSum[j-1]-prefixSum[i-1];
            }
            if(average <= temp/k){
                average = temp/k;
            }
            i++;
            j++;
        }
        return average;
    }
}