import java.util.List;
import java.util.ArrayList;
public class FindWordsContainingCharacter{
    public static void main(String[] args){
        String[] words = {"leet", "code"};
        char c = 'e';
        List<Integer> res = findWordsContaining(words,c);
        System.out.println(res);
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < words.length; i++){
            String str = words[i];
            if(str.indexOf(x)>=0){
                list.add(i);
            }
        }
        return list;
    }
}