import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class ShortestWordDistance{
    public static void main(String[] args){
        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";
        System.out.println(shortestDistance(wordsDict, word1, word2));
    }
    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        HashMap<String, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < wordsDict.length; i++){
            if(wordsDict[i].equals(word1)){
                if(map.containsKey(wordsDict[i])){
                    List<Integer> list = map.get(wordsDict[i]);
                    list.add(i);
                    map.put(wordsDict[i], list);
                }
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    map.put(wordsDict[i], list);
                }
            }
            else if(wordsDict[i].equals(word2)){
                if(map.containsKey(wordsDict[i])){
                    List<Integer> list = map.get(wordsDict[i]);
                    list.add(i);
                    map.put(wordsDict[i], list);
                }
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    map.put(wordsDict[i], list);
                }
            }
        }
        int minDistance = Integer.MAX_VALUE;
        for(int num1 : map.get(word1)){
            for(int num2 : map.get(word2)){
                int distance = Math.abs(num1-num2);
                if(distance < minDistance){
                    minDistance = distance;
                }
            }
        }
        return minDistance;
    }
}