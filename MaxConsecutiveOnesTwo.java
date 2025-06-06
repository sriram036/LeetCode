public class MaxConsecutiveOnesTwo{
    public static void main(String[] args){
        int[] nums = {1, 0, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        boolean isAllOne = true;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 1){
                isAllOne = false;
            }
        }
        if(isAllOne){
            return nums.length;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0){
                nums[i] = 1;
                int temp = 0;
                for(int j = 0; j < nums.length; j++){
                    if(nums[j]==1){
                        temp++;
                    }
                    else{
                        if(res <= temp){
                            res = temp;
                        }
                        temp = 0;
                    }
                }
                if(res <= temp){
                    res = temp;
                }
                nums[i] = 0;
            }
        }
        return res;
    }
}