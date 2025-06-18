import java.util.List;
import java.util.ArrayList;
public class SpiralMatrix{
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        makeCircle(matrix, list, m, n, 0, -1, 0, 1);
        return list;
    }
    public static void makeCircle(int[][] matrix, List<Integer> list, int m, int n, int r, int c, int dr, int dc){
        if(m==0 || n==0){
            return;
        }
        for(int i = 0; i < n; i++){
            r += dr;
            c += dc;
            list.add(matrix[r][c]);
        }
        makeCircle(matrix, list, n, m-1, r, c, dc, -dr);
    }
}