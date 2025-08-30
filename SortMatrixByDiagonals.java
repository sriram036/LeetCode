import java.util.Arrays;
public class SortMatrixByDiagonals{
    public static void main(String[] args){
        int[][] grid = {{1,7,3},{9,8,2},{4,5,6}};
        int[][] res = sortMatrix(grid);
        for(int[] row : res){
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        int[][] res = new int[n][n];
        for(int i = 0; i < n; i++){
            int iIndex = i;
            int[] temp = new int[n-i];
            int count = 0;
            for(int j = 0; j < n-i; j++){
                temp[count++] = grid[iIndex++][j];
            }
            Arrays.sort(temp);
            count = i;
            for(int j = 0; j < n-i; j++){
                res[count++][j] = temp[temp.length-j-1];
            }
        }
        for(int i = 0; i < n-1; i++){
            int[] temp = new int[n-i-1];
            int colIndex = i+1;
            for(int j = 0; j < n-i-1; j++){
                temp[j] = grid[j][colIndex++];
            }
            Arrays.sort(temp);
            colIndex = i+1;
            for(int j = 0; j < n-i-1; j++){
                res[j][colIndex++] = temp[j];
            }
        }
        return res;
    }
}