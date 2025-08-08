import java.util.HashMap;
public class FindSmallestCommonElementInAllRows{
    public static void main(String[] args){
        int[][] mat = {{1,2,3},{2,3,4},{2,3,5}};
        System.out.println(smallestCommonElement(mat));
    }
    public static int smallestCommonElement(int[][] mat) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                map.put(mat[i][j], map.getOrDefault(mat[i][j],0)+1);
            }
        }
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq == mat.length){
                return key;
            }
        }
        return -1;
    }
}