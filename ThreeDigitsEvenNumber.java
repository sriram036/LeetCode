import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class ThreeDigitsEvenNumber{
    public static void main(String[] args){
        int[] digits = {2,2,8,8,2};
        System.out.println(Arrays.toString(findEvenNumbers(digits)));
    }
    public static int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 100; i < 999; i++){
            if(i%2==0 && isPossible(digits,i)){
                list.add(i);
            }
        }
        int n = list.size();
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = list.get(i);
        }
        return res;
    }
    public static boolean isPossible(int[] digits, int num){
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < digits.length; i++) {
            list.add(digits[i]);
        }
        int count = 0;
        while(num > 0){
            int digit = num%10;
            if(list.indexOf(digit) != -1){
                count += 1;
                int index = list.indexOf(digit);
                list.set(index, -1);
            }
            num /= 10;
        }
        return count==3;
    }
}