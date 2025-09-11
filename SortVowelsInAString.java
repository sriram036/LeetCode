import java.util.Arrays;
public class SortVowelsInAString{
    public static void main(String[] args){
        String s = "lEetcOde";
        System.out.println(sortVowels(s));
    }
    public static String sortVowels(String s) {
        int n = s.length();
        char[] charArr = s.toCharArray();
        char[] vowelArr = new char[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'||c == 'A'||c == 'E'||c == 'I'||c == 'O'||c == 'U'){
                vowelArr[count++] = c;
            }
        }
        Arrays.sort(vowelArr);
        count = n-1;
        for(int i = n-1; i >= 0; i--){
            char c = s.charAt(i);
            if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'||c == 'A'||c == 'E'||c == 'I'||c == 'O'||c == 'U'){
                charArr[i] = vowelArr[count--];
            }
        }
        String newStr = new String(charArr);
        return newStr;
    }
}