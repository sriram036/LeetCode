import java.util.Arrays;

import java.util.Arrays;
public class DivideAStringIntoGroupsOfSizeK {
    public static void main(String[] args) {
        String s = "abcdefghij";
        int k = 3;
        char fill = 'x';
        System.out.println(Arrays.toString(divideString(s, k, fill)));
    }
    public static String[] divideString(String s, int k, char fill) {
        String[] strArr;
        if(s.length()%k==0){
            strArr = new String[s.length()/k];
        }
        else{
            strArr = new String[(s.length()/k)+1];
        }
        int index = 0;
        while (s.length()>0) {
            if(s.length()>=k){
                String str = s.substring(0, k);
                strArr[index++] = str;
                s = s.substring(k);
            }
            else{
                while(s.length()<k){
                    s += fill;
                }
            }
        }
        return strArr;
    }
}
