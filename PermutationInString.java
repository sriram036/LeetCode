import java.util.Arrays;
public class PermutationInString{
    public static void main(String[] args){
        String s1 = "bc";
        String s2 = "ad";
        System.out.println(checkInclusion(s1, s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        char[] originalCharArray = s1.toCharArray();
        Arrays.sort(originalCharArray);
        String original = new String(originalCharArray);
        for(int i = 0; i <= s2.length()-s1.length(); i++){
            String str = s2.substring(i, i+s1.length());
            // System.out.println(str);
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String subString = new String(charArray);
            if(original.equals(subString)){
                return true;
            }
        }
        return false;
    }
}