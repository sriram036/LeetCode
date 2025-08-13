import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class FindTheTownJudge{
    public static void main(String[] args){
        int n = 3;
        int[][] trust = {{1,3},{2,3}};
        System.out.println(findJudge(n, trust));
    }
    public static int findJudge(int n, int[][] trust) {
        if(n > 1 && trust.length==0){
            return -1;
        }
        if(n < 1 && trust.length==0){
            return n;
        }
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0;i < trust.length; i++){
            for(int j = 0; j < trust[0].length/2; j++){
                if(!map.containsKey(trust[i][j])){
                    List<Integer> list = new ArrayList<>();
                    list.add(trust[i][j+1]);
                    map.put(trust[i][j],list);
                }
                else{
                    List<Integer> temp = map.get(trust[i][j]);
                    temp.add(trust[i][j+1]);
                    map.put(trust[i][j],temp);
                }
            }
        }
        // System.out.println(map);
        for(int i = 1;i <= n; i++){
            if(!map.containsKey(i)){
                int count = 0;
                for(int j = 1; j <= n; j++){
                    if(i != j){
                        if(map.containsKey(j) && map.get(j).contains(i)){
                            count++;
                        }
                    }
                }
                // System.out.println(count);
                if(count == n-1){
                    return i;
                }
            }
        }
        return -1;
    }
}