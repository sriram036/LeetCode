public class FindNumbersWithEvenNumberOfDigits{
    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(findNoOfDigits(nums[i], 0)%2==0){
                counter++;
            }
        }
        return counter;
    }
    public static int findNoOfDigits(int num, int count){
        if(num <= 0){
            return count;
        }
        num /= 10;
        return findNoOfDigits(num, count+1);
    }
}