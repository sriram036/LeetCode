import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class ReorderPowerOfTwo{
    public static void main(String[] args){
        System.out.println(reorderedPowerOf2(123));
    }
    public static boolean reorderedPowerOf2(int n) {
        if(n == 1000000000){
            return false;
        }
        List<String> list = new ArrayList<>();
        reorderRecur("", String.valueOf(n), list);
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < 31; i++){
            int temp = (int)Math.pow(2,i);
            map.put(String.valueOf(temp), 1);
        }
        for(String str : list){
            if(map.containsKey(str)){
                return true;
            }
        }
        return false;
    }
    public static void reorderRecur(String pro,String n, List<String> list){
        if(n.length()==0){
            list.add(pro);
            return;
        }
        for(int i = 0; i < n.length(); i++){
            reorderRecur(pro+n.charAt(i), n.substring(0,i)+n.substring(i+1, n.length()), list);
        }
    }
}