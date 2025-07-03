public class FindTheKthCharacterInAStringGameOne {
    public static void main(String[] args){
        System.out.println(kthCharacter(10));
    }
    public static char kthCharacter(int k) {
        String s = kthCharacterRecursion("a", k);
        return s.charAt(k-1);
    }
    public static String kthCharacterRecursion(String s, int k){
        if(s.length()>=k){
            return s;
        }
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c=='Z'){
                temp += 'a';
            }
            else{
                int num = (int)c;
                temp += (char)++num;
            }
        }
        return kthCharacterRecursion(s+temp, k);
    }
}
