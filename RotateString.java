public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
    public static boolean rotateString(String s, String goal) {
        String temp = s;
        for(int i = 0; i < s.length(); i++){
            char c = temp.charAt(0);
            temp = temp.substring(1);
            temp += c;
            // System.out.println(temp);
            if(temp.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
