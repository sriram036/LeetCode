import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class EliminationGame{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(lastRemaining(num));
    }
    public static int lastRemaining(int n) {
        
        // List<Integer> nums = new ArrayList<Integer>();
        // for(int i = 1; i <= n; i++){
        //     nums.add(i);
        // }
        // System.out.println(nums);
        // lastRemainingRecursion(nums,true);
        // return nums.get(0);
        if(n<=1){
            return 1;
        }
        int num = 2*(n/2+1-lastRemaining(n/2));
        return num;
    }
    public static void lastRemainingRecursion(List<Integer> nums, boolean isTrue){
        // System.out.println(nums);
        if(nums.size()<=1){
            return;
        }
        if(isTrue){
            for(int i = 0; i < nums.size(); i=i+1){
                // System.out.println(i);
                if(nums.size() >= 2){
                    nums.remove(i);
                }
            }
        }
        else{
            for(int i = nums.size()-1; i >= 0; i=i-2){
                // System.out.println(i);
                if(nums.size() >= 2){
                    nums.remove(i);
                }
            }
        }
        lastRemainingRecursion(nums,!isTrue);
    }
}