public class BombEnemy{
    public static void main(String[] args){
        char[][] matrix = {{'0','E','0','0'},{'E','0','W','E'},{'0','E','0','0'}};
        // char[][] matrix = {{'W','E','E','E','E','0','E','E','E','E','E','W'}};
        int num = maxKilledEnemies(matrix);
        System.out.println(num);
    }
    public static int maxKilledEnemies(char[][] grid) {
        int max = 0;
        int temp = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j]=='0'){
                    System.out.print("X" + " ");
                    temp = findMaxKill(grid,i,j);
                }
                else{
                    System.out.print("Y" + " ");
                }
                if(temp > max){
                    max = temp;
                }
            }
            System.out.println();
        }
        return max;
    }
    public static int findMaxKill(char[][] matrix, int i, int j){
        int left = 0;
        int leftJ = j;
        // System.out.println(i+" "+j);
        while(--leftJ >= 0){
            if(matrix[i][leftJ] == 'W'){
                break;
            }
            if(matrix[i][leftJ]=='E'){
                left++;
            }
        }
        // System.out.println(left);
        int right = 0;
        int rightJ = j;
        while(++rightJ < matrix[0].length){
            if(matrix[i][rightJ] == 'W'){
                break;
            }
            if(matrix[i][rightJ]=='E'){
                right++;
            }
        }
        int top = 0;
        int topI = i;
        while(--topI >= 0){
            if(matrix[topI][j]=='W'){
                break;
            }
            if(matrix[topI][j]=='E'){
                top++;
            }
        }
        int bottom = 0;
        int bottomI = i;
        while(++bottomI < matrix.length){
            if(matrix[bottomI][j]=='W'){
                break;
            }
            if(matrix[bottomI][j]=='E'){
                bottom++;
            }
        }
        return left+right+top+bottom;
    }
}