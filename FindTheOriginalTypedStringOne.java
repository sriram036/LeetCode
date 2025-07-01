public class FindTheOriginalTypedStringOne{
    public static void main(String[] args){
        String s = "abbcccc";
        System.out.println(possibleStringCount(s));
    }
    public static int possibleStringCount(String word) {
        int count = 1;
        for(int i = 0; i < word.length()-1; i++){
            if(word.charAt(i)==word.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
}