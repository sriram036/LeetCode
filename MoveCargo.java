public class MoveCargo{
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        // int capacity = 15;
        System.out.println(sol(nums, days));
    }
    public static int sol(int[] weights, int days){
        int max = 0;
        int total = 0;
        for(int weight : weights){
            total += weight;
            max = Math.max(max, weight);
        }
        int low = max;
        int high = total;

        while(low < high){
            int mid = (low + high)/2;
            if(canAdd(weights, mid, days)){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public static boolean canAdd(int[] nums, int mid, int days){
        int daysrequired = 1;
        int load = 0;
        for(int num : nums){
            load += num;
            if(load > mid){
                daysrequired++;
                load = num;
            }
        }
        return daysrequired <= days;
    }
}

// weights = [1,2,3,4,5,6,7,8,9,10], days = 5, capacity = 15 
// ? can this ship shift all the packages to destination ?