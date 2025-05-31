import java.util.List;
import java.util.ArrayList;
public class MaximumPointsYouCanObtainFromCards{
    public static void main(String[] args){
        // int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        // int k = 3;
        // int[] cardPoints = {2, 2, 2};
        // int k = 2;
        // int[] cardPoints = {9, 7, 7, 9, 7, 7, 9};
        // int k = 7;
        // int[] cardPoints = {96,90,41,82,39,74,64,50,30};
        // int k = 8;
        int[] cardPoints = {30,88,33,37,18,77,54,73,31,88,93,25,18,31,71,8,97,20,98,16,65,40,18,25,13,51,59};
        int k = 26;
        // Ans = 1269
        System.out.println(maxScore(cardPoints, k));
    }

    // Sliding Window Approach
    public static int maxScore(int[] cardPoints, int k){
        int sum = 0;
        int max = 0;
        int windowLength = cardPoints.length-k;
        // System.out.println(windowLength);
        for(int i = 0; i < cardPoints.length; i++){
            sum += cardPoints[i];
        }
        if(cardPoints.length == k){
            return sum;
        }
        for(int i = 0; i <= cardPoints.length-windowLength; i++){
            int temp = findSum(cardPoints, i, i+windowLength);
            // System.out.println(sum + " " + temp +" "+ (sum-temp));
            if(sum-temp > max){
                max = sum-temp;
            }
        }
        return max;
    }
    public static int findSum(int[] nums, int i, int j){
        int sum = 0;
        for(int k = i; k < j; k++){
            sum += nums[k];
        }
        return sum;
    }

    // Recursion Approach
    // public static int maxScore(int[] cardPoints, int k) {
    //     List<Integer> list = new ArrayList<Integer>();
    //     for(int i = 0; i < cardPoints.length; i++){
    //         list.add(cardPoints[i]);
    //     }
    //     int[] max = {0};
    //     maxScoreRecursion(0, list, max, 0, k);
    //     return max[0];
    // }
    // public static void maxScoreRecursion(int total, List<Integer> list, int[] max, int level, int k){
        
    //     if(max[0] < total){
    //         max[0] = total;
    //     }
    //     if(level==k){
    //         // System.out.println(max[0]);
    //         return;
    //     }
    //     List<Integer> temp = new ArrayList<Integer>();
    //     temp.addAll(list);
    //     int val = temp.get(0);
    //     temp.remove(0);
    //     // System.out.println(temp + " " + max[0] + " " + level);
    //     maxScoreRecursion(total+val, temp, max, level+1, k);
    //     List<Integer> temp2 = new ArrayList<Integer>();
    //     temp2.addAll(list);
    //     int val2 = temp2.get(temp2.size()-1);
    //     temp2.remove(temp2.size()-1);
    //     // System.out.println(temp2 + " " + max[0] + " " + level);
    //     maxScoreRecursion(total+val2, temp2, max, level+1, k);
    // }
}