public class NumberOfZeroFilledSubarrays{
    public static void main(String[] args){
        int[] nums = {1,3,0,0,2,0,0,4};
        System.out.println(zeroFilledSubarray(nums));
    }
    public static long zeroFilledSubarray(int[] nums) {
        long total = 0;
        for(int i = 0; i < nums.length; i++){
            long counter = 0;
            if(nums[i]==0){
                while(i < nums.length && nums[i]==0){
                    // System.out.println(nums[i]);
                    ++counter;
                    i++;
                }
                // System.out.println(counter);
                // total += sumFactorial(counter);
                total += counter * (counter+1)/2;
            }
        }
        return total;    
    }
    public long sumFactorial(long num){
        if(num == 1){
            return 1;
        }
        return num+sumFactorial(num-1);
    }
}