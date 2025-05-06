import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class LetterCombinationOfAPhoneNumber{
    public static void main(String[] args){
        String digits = "23";
        List<String> list = letterCombinations(digits);
        System.out.println(list);
    }
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        if(digits.isEmpty()){
            return list;
        }
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        list = letterCombinationsRecursion("", digits, map, list);
        return list;
    }
    public static List<String> letterCombinationsRecursion(String p, String uP, HashMap<Integer, String> map, List<String> list){
        if(uP.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = uP.charAt(0);
        int num = Integer.parseInt(String.valueOf(ch));
        // System.out.println(num);
        String mapValue = map.get(num);
        // System.out.println(mapValue);
        for(int i = 0; i < mapValue.length(); i++){
            letterCombinationsRecursion(p + mapValue.charAt(i),uP.substring(1), map, list);
        }
        return list;
    }
}