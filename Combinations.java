import java.util.List;
import java.util.ArrayList;
public class Combinations{
    public static void main(String[] args){
        int n = 4;
        int k = 2;
        System.out.println(combine(n,k));
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<Integer>();
        combinations(lists, list, n, k, 1);
        return lists;
    }
    public static void combinations(List<List<Integer>> lists, List<Integer> list, int n, int k, int i){
        if(list.size()==k){
            lists.add(list);
        }
        if(list.size() != 0 && list.get(list.size()-1)==n){
            return;
        }
        for(int j = i; j <= n; j++){
            List<Integer> temp = new ArrayList<Integer>();
            temp.addAll(list);
            temp.add(j);
            combinations(lists, temp, n, k, j+1);
        }
    }
}