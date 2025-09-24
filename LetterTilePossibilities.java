import java.util.HashMap;
public class LetterTilePossibilities{
    public static void main(String[] args){
        String tiles = "AAAAAAA";
        System.out.println(numTilePossibilities(tiles));
    }
    public static int numTilePossibilities(String tiles) {
        HashMap<String, Integer> map = new HashMap<>();
        boolean[] isVisited = new boolean[tiles.length()];
        numTileRecur(tiles, "", isVisited, map);
        return map.size();
    }
    public static void numTileRecur(String tiles, String processed, boolean[] isVisited, HashMap<String, Integer> map){
        if(processed.length() == tiles.length()){
            // System.out.println(processed);
            return;
        }
        for(int i = 0; i < tiles.length(); i++){
            if(!isVisited[i]){
                isVisited[i] = true;
                String str = processed+tiles.charAt(i);
                if(!map.containsKey(str)){
                    map.put(str, 1);
                }
                numTileRecur(tiles, str, isVisited, map);
                isVisited[i] = false;
            }
        }
    }
}