public class FindTheKthCharacterInAStringGameTwo {
    public static void main(String[] args){
        int[] operations = {0,0,0,0,0,0,1,0,1,1,1,0,1,0,1,1,0,0,0,1,0,0,1,1,1};
        System.out.println(kthCharacter(26642561, operations));
    }
    public static char kthCharacter(long k, int[] operations) {
        String s = kthCharacterRecursion("a", operations, 0);
        System.out.println(s);
        return 'c';
        // return s.charAt((int)--k);
    }
    public static String kthCharacterRecursion(String s, int[] operations, int index){
        if(operations.length==index){
            return s;
        }
        String temp = "";
        if(operations[index]==1){
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
        }
        else{
            temp = s;
        }
        System.out.println(s+temp + " " + index);
        return kthCharacterRecursion(s+temp, operations, index+1);
    }
}
