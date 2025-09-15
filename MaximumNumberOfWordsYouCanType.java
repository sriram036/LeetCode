import java.util.HashMap;
public class MaximumNumberOfWordsYouCanType{
    public static void main(String[] args){
        String text = "leet code";
        String brokenLetters = "lt";
        System.out.println(canBeTypedWords(text, brokenLetters));
    }
    public static int canBeTypedWords(String text, String brokenLetters) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < brokenLetters.length(); i++){
            map.put(brokenLetters.charAt(i), map.getOrDefault(brokenLetters.charAt(i), 0)+1);
        }
        int count = 0;
        for(String str : text.split(" ")){
            boolean isFound = false;
            for(int i = 0; i < str.length(); i++){
                if(map.containsKey(str.charAt(i))){
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                count++;
            }
        }
        return count;
    }
}