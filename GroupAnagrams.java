import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Arrays;
public class GroupAnagrams{
    public static void main(String[] args){
        String[] strs = {"eat", "tea", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            if(!map.containsKey(sortedStr)){
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedStr, list);
            }
            else{
                List<String> list = map.get(sortedStr);
                list.add(str);
                map.put(sortedStr, list);
            }
        }
        for(String key : map.keySet()){
            lists.add(map.get(key));
        }
        return lists;
    }
}