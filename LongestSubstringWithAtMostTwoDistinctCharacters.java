import java.util.HashMap;
public class LongestSubstringWithAtMostTwoDistinctCharacters {
    public static void main(String[] args){
        String s = "eceba";
        System.out.println(lengthOfLongestSubstringTwoDistinct(s));
    }
    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        int res = 0;
        int i = 0;
        int j = 0;
        int temp = 0;
        while(j < s.length()){
            if(map.size()<=2){
                map.put(String.valueOf(s.charAt(j)), map.getOrDefault(String.valueOf(s.charAt(j)), 0)+1);
                if(map.size()<=2){
                    temp = 0;
                    for(int freq : map.values()){
                        temp += freq;
                    }
                    if(temp > res){
                        res = temp;
                    }
                }
                j += 1;
            }
            else{
                map.put(String.valueOf(s.charAt(i)), map.getOrDefault(String.valueOf(s.charAt(i)), 0)-1);
                if(map.get(String.valueOf(s.charAt(i)))==0){
                    map.remove(String.valueOf(s.charAt(i)));
                }
                i += 1;
            }
        }
        if(temp > res){
            res = temp;
        }
        return res;
    }
}
