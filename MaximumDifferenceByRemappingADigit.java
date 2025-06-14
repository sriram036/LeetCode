public class MaximumDifferenceByRemappingADigit{
    public static void main(String[] args){
        int num = 11891;
        System.out.println(minMaxDifference(num));
    }
    public static int minMaxDifference(int num) {
        String maxString = "";
        String stringNum = num+"";
        String minString = "";
        char ch = 'a';
        for(int i = 0;i < stringNum.length(); i++){
            if(stringNum.charAt(i) != '9'){
                ch = stringNum.charAt(i);
                break;
            }
        }
        for(int i = 0;i < stringNum.length(); i++){
            if(stringNum.charAt(i) == ch){
                maxString += '9';
            }
            else{
                maxString += stringNum.charAt(i);
            }
        }
        ch = 'a';
        for(int i = 0; i < stringNum.length(); i++){
            if(stringNum.charAt(i) != '0'){
                ch = stringNum.charAt(i);
                break;
            }
        }
        for(int i = 0;i < stringNum.length(); i++){
            if(stringNum.charAt(i) == ch){
                minString += '0';
            }
            else{
                minString += stringNum.charAt(i);
            }
        }
        return Integer.parseInt(maxString)-Integer.parseInt(minString);
    }
}