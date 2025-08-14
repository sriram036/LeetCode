public class LargestThreeSameDigitNumberInString{
    public static void main(String[] args){
        String num = "6777133339";
        System.out.println(largestGoodInteger(num));
    }
    public static String largestGoodInteger(String num) {
        for(int i = 9; i >= 0; i--){
            String str = i+""+i+""+i;
            if(num.indexOf(str) >= 0){
                return str;
            }
        }
        return "";
    }
}