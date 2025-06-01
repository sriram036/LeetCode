import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class FindAllAnagramsInAString{
    public static void main(String[] args){
        String s = "aaabb";
        String p = "bb";
        List<Integer> list = findAnagrams(s, p);
        System.out.println(list);
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i <= s.length()-p.length(); i++){
            String subStr = s.substring(i, i+p.length());
            // System.out.println(subStr);
            if(isAnagram(subStr, p)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean isAnagram(String str, String originalStr){
        if(str.length() != originalStr.length()){
            return false;
        }
        char[] arr1 = str.toCharArray();
        char[] arr2 = originalStr.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }
}