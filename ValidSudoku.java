import java.util.HashMap;
public class ValidSudoku{
    public static void main(String[] args){
        char[][] board = 
        {{'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        boolean isColumnTrue = isColumnValid(board);
        boolean isRowTrue = isRowValid(board);
        boolean isMatrixTrue = isMatrixValid(board);
        return isColumnTrue && isRowTrue && isMatrixTrue;
    }
    public static boolean isMatrixValid(char[][] board){
        for(int i = 0;i < board.length; i += 3){
            for(int j = 0; j < board[0].length; j += 3){
                boolean isMatrixValid = searchMatrix(i, j, board);
                if(!isMatrixValid){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean searchMatrix(int x, int y, char[][] board){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = x; i < x+3; i++){
            for(int j = y; j < y+3; j++){
                if(board[i][j] != '.'){
                    map.put(board[i][j], map.getOrDefault(board[i][j], 0) + 1);
                }
            }
        }
        for(char key : map.keySet()){
            int count = map.get(key);
            if(count > 1){
                return false;
            }
        }
        return true;
    }
    public static boolean isRowValid(char[][] board){
        for(int i = 0; i < board.length; i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != '.'){
                    map.put(board[i][j], map.getOrDefault(board[i][j],0)+1);
                }
            }
            for(char key : map.keySet()){
                int count = map.get(key);
                if(count > 1){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isColumnValid(char[][] board){
        for(int i = 0; i < board.length; i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j = 0; j < board[0].length; j++){
                if(board[j][i] != '.'){
                    map.put(board[j][i], map.getOrDefault(board[j][i],0)+1);
                }
            }
            for(char key : map.keySet()){
                int count = map.get(key);
                if(count > 1){
                    return false;
                }
            }
        }
        return true;
    }
}