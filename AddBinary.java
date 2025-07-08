public class AddBinary {
    public static void main(String[] args){
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }
    public static String addBinary(String a, String b) {
        int len = 0;
        if(a.length() > b.length()){
            len = a.length();
        }
        else{
            len = b.length();
        }
        String s = "";
        boolean isTrue = false;
        String aChar = "";
        String bChar = "";
        for(int i = 0; i < len; i++){
            int aIndex = a.length()-i-1;
            int bIndex = b.length()-i-1;
            if(aIndex < 0){
                aChar = "0";
            }
            else{
                aChar = a.charAt(aIndex)+"";
            }
            if(bIndex < 0){
                bChar = "0";
            }
            else{
                bChar = b.charAt(bIndex)+"";
            }
            if(isTrue){
                if(aChar.equals("1")){
                    aChar = "0";
                    isTrue = true;
                }
                else{
                    aChar = "1";
                    isTrue = false;
                }
            }
            if(aChar.equals("1") && bChar.equals("1")){
                s += "0";
                isTrue = true;
            }
            else if(aChar.equals("1") && bChar.equals("0")){
                s += "1";
            }
            else if(aChar.equals("0") && bChar.equals("1")){
                s += "1";
            }
            else{
                s += "0";
            }
        }
        if(isTrue){
            return reverseString(s+"1");
        }
        return reverseString(s);
    }
    public static String reverseString(String s){
        String reverse = "";
        for(int i = 0; i < s.length(); i++){
            reverse += s.charAt(s.length()-i-1);
        }
        return reverse;
    }
}
