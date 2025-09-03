import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class ReverseWordsInAStringTwo{
    public static void main(String[] args){
        char[] s = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
        System.out.println("Before : "+Arrays.toString(s));
        reverseWords(s);
        System.out.println("After : "+Arrays.toString(s));
    }
    public static void reverseWords(char[] s) {
        String str = new String(s);
        int n = s.length;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < s.length; i++){
            int j = i;
            String sub = "";
            while(j < n && s[j] != ' '){
                sub += s[j];
                j++;
            }
            // System.out.println(sub);
            list.add(sub);
            i = j;
        }
        int index = 0;
        for(int i = list.size()-1; i >=0; i--){
            String sub = list.get(i);
            for(int j = 0; j < sub.length(); j++){
                s[index++] = sub.charAt(j);
            }
            if(index < n){
                s[index++] = ' ';
            }
        }
    }
}