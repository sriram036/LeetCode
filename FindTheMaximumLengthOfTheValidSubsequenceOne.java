public class FindTheMaximumLengthOfTheValidSubsequenceOne {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4};
        System.out.println(maximumLength(nums));
    }
    public static int maximumLength(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        int evenOddCount = 0;
        int oddEvenCount = 0;
        for(int num : nums){
            if(num%2==1){
                oneCount += 1;
                oddEvenCount = Math.max(evenOddCount+1, oddEvenCount);
            }
            else{
                zeroCount += 1;
                evenOddCount = Math.max(evenOddCount , oddEvenCount+1);
            }
        }
        return Math.max(Math.max(zeroCount, oneCount), Math.max(evenOddCount, oddEvenCount));
    }
}
