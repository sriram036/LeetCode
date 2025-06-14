import java.util.HashMap;
public class HappyNumber{
    public static void main(String[] args){
        int num = 19;
        System.out.println(isHappy(num));
    }
    // Approach - 1
    public static boolean isHappy(int n) {
        int t = n;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        while(t != 1){
            if(map.containsKey(t)){
                return false;
            }
            map.put(t, 1);
            t = findSumOfSquare(t);
        }
        return true;
    }
    // Approach - 2
    // public static boolean isHappy(int n) {
    //     int slow = n;
    //     int fast = n;
    //     do{
    //         slow = findSumOfSquare(slow);
    //         fast = findSumOfSquare(findSumOfSquare(fast));
    //     }
    //     while(slow != fast);
    //     if(slow==1){
    //         return true;
    //     }
    //     return false;
    // }
    public static int findSumOfSquare(int n){
        int res = 0;
        while(n>0){
            int index = n%10;
            res += (index*index);
            n /= 10;
        }
        return res;
    }
}