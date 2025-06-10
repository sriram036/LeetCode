import java.util.HashMap;
import java.util.Set;
public class MaximumDifferenceBetweenEvenAndOddFrequencyOne{
    public static void main(String[] args){
        String s = "aaaaabbc";
        System.out.println(maxDifference(s));
    }
    public static int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        Set<Character> keys = map.keySet();
        int oddMax = 0;
        int minEven = Integer.MAX_VALUE;
        for(Character ch : keys){
            int num = map.get(ch);
            if(num%2==1){
                if(oddMax < num){
                    oddMax = num;
                }
            }
            else{
                if(minEven > num){
                    minEven = num;
                }
            }
        }
        return oddMax-minEven;
    }
}