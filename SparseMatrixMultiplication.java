import java.util.Arrays;
public class SparseMatrixMultiplication{
    public static void main(String[] args){
        int[][] mat1 = {{1,0,0},{-1,0,3}};
        int[][] mat2 = {{7,0,0},{0,0,0},{0,0,1}};
        int[][] res = multiply(mat1, mat2);
        for(int[] temp : res){
            System.out.println(Arrays.toString(temp));
        }
    }
    public static int[][] multiply(int[][] mat1, int[][] mat2) {
        int[][] res = new int [mat1.length][mat2[0].length];
        for(int i = 0; i < mat1.length; i++){
            for(int j = 0; j < mat1[0].length; j++){
                for(int k = 0; k < mat2[0].length; k++){
                    res[i][k] += mat1[i][j] * mat2[j][k];
                }
            }
            
        }
        return res;
    }
}