import java.util.List;
import java.util.ArrayList;
public class Triangle{
    Integer[][] dp;
    int n;
    List<List<Integer>> triangle;
    public static void main(String[] args){
        // [[2],[3,4],[6,5,7],[4,1,8,3]]
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);
        Triangle obj = new Triangle();
        System.out.println(obj.minimumTotal(lists));
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        this.triangle = triangle;
        this.n = triangle.size();
        dp = new Integer[n][n];
        return sol( 0, 0);
    }
    public int sol(int i, int j){
        if(i == n){
            return 0;
        }
        if(dp[i][j] != null){
            return dp[i][j];
        }
        int curr = sol(i+1, j);
        int next = sol(i+1, j+1);

        return dp[i][j] = triangle.get(i).get(j) + Math.min(curr, next);
    }
}