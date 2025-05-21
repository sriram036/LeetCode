public class SetMatrixZeroes{
    public static void main(String[] args){
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println("Before :");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        setZeroes(matrix);
        System.out.println("After :");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {
        boolean[][] flagMatrix = new boolean[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j]==0){
                    flagMatrix[i][j] = true;
                }
                else{
                    flagMatrix[i][j] = false;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(flagMatrix[i][j]==true){
                    fillMatrix(matrix, i, j);
                }
            }
        }
    }
    public static void fillMatrix(int[][] matrix, int i, int j){
        for(int k = 0; k < matrix[0].length; k++){
            matrix[i][k] = 0;
        }
        for(int k = 0; k < matrix.length; k++){
            matrix[k][j] = 0;
        }
    }
}