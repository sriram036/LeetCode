public class ValidWord{
    public static void main(String[] args){
        String word = "aaa";
        System.out.println(isValid(word));
    }
    public static boolean isValid(String word) {
        boolean isVowel = false;
        boolean isConsonant = false;
        for(char c : word.toLowerCase().toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
            if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){
                isVowel = true;
            }
            if(c == 'b' ||c == 'c' ||c == 'd' ||c == 'f' ||c == 'g'|| c == 'h' ||c == 'j' ||c == 'k' ||c == 'l' ||c == 'm' || c == 'n' ||c == 'p' ||c == 'q' ||c == 'r' ||c == 's' || c == 't' ||c == 'v' ||c == 'w' ||c == 'x' ||c == 'y' ||c == 'z'){
                isConsonant = true;
            }
        }
        if(word.length() >= 3 && isConsonant && isVowel){
            return true;
        }
        return false;
    }
}