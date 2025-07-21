public class DeleteCharactersToMakeFancyString {
    public static void main(String[] args){
        System.out.println(makeFancyString("leeetcode"));
    }
    public static String makeFancyString(String s) {
        char prev = s.charAt(0);
        int count = 1;
        StringBuilder res = new StringBuilder();
        res.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                count++;
            } else {
                prev = s.charAt(i);
                count = 1;
            }
            if (count < 3) {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
