public class WordSearch{
    public static void main(String[] args){
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
    static boolean isTrue= false;
    public static boolean exist(char[][] board, String word) {
        for(int i = 0;i < board.length; i++){
            for(int j = 0;j < board[0].length; j++){
                if(board[i][j]==word.charAt(0)){
                    boolean[][] isVisited = new boolean[board.length][board[0].length];
                    // System.out.println(board[i][j]+" "+word.charAt(0));
                    existRecur(board, i, j, word, String.valueOf(board[i][j]), isVisited);
                    if(isTrue){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void existRecur(char[][] board, int r, int c, String word, String s, boolean[][] mat){
        // System.out.println(s);
        if(mat[r][c]){
            return;
        }
        if(s.length()== word.length()){
            if(s.equals(word)){
                isTrue = true;
            }
            return;
        }
        mat[r][c]=true;

        if(!isTrue && r < board.length-1){
            existRecur(board, r+1, c, word, s+board[r+1][c], mat);
        }
        if(!isTrue && c < board[0].length-1){
            existRecur(board, r, c+1, word, s+board[r][c+1], mat);
        }
        if(!isTrue && r > 0){
            existRecur(board, r-1, c, word, s+board[r-1][c], mat);
        }
        if(!isTrue && c > 0){
            existRecur(board, r, c-1, word, s+board[r][c-1], mat);
        }
        mat[r][c] = false;
    }
}