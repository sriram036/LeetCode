public class FindTheMinimumAreaToCoverAllOnesOne{
    public static void main(String[] args){
        int[][] grid = {{1,0},{0,0}};
        System.out.println(minimumArea(grid));
    }
    public static int minimumArea(int[][] grid) {
        int minRow = grid.length;
        int maxRow = 0;
        int minCol = grid[0].length;
        int maxCol = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j <grid[0].length; j++){
                if(grid[i][j]==1){
                    minRow = Math.min(minRow,i);
                    maxRow = Math.max(maxRow,i);
                    minCol = Math.min(minCol,j);
                    maxCol = Math.max(maxCol,j);
                }
            }
        }
        return ((maxRow-minRow)+1)*((maxCol-minCol)+1);
    }
}