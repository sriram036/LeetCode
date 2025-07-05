import java.util.HashMap;

public class FindLuckyIntegerInAnArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 3, 3};
        System.out.println(findLucky(arr));
    }
    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        int res = -1;
        for (int key : map.keySet()) {
            int val = map.get(key);
            if(key==val && val > res){
                res = val;
            }
        }
        return res;
    }
}
