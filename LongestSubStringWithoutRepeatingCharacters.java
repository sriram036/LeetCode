import java.util.HashMap;
public class LongestSubStringWithoutRepeatingCharacters{
    public static void main(String[] args){
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println(length);
    }
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0;
        int j = 0;
        while(i < s.length() || j < s.length()){
            if(canMoveForward(s,i,j)){
                if(j < s.length()){
                    ++j;
                }
                else{
                    ++i;
                }
            }
            else{
                ++i;
            }
            // System.out.println(i+" "+j + " ");
            int windowLength = j-i;
            if(windowLength > max){
                max = windowLength;
            }
        }
        return max;
    }
    public static boolean canMoveForward(String s, int i, int j){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        if(j < s.length()){
            for(int k = i; k <= j; k++){
                if(map.containsKey(s.charAt(k))){
                    return false;
                }
                else{
                    map.put(s.charAt(k),1);
                }
            }
        }
        
        return true;
    }
}