import java.util.ArrayList;
import java.util.List;
public class GenerateParentheses{
    public static void main(String[] args){
        int n = 3;
        List<String> list = new ArrayList<String>();
        list = generateParentheses("",n,0,0,list);
        System.out.println(list);
    }
    public static List<String> generateParentheses(String processed,int total, int leftCount, int rightCount,List<String> list){
        // System.out.println(processed + " " + total + " " + leftCount + " " + rightCount);
        if(leftCount == total && rightCount == total){
            // System.out.println(processed);
            list.add(processed);
            return list;
        }
        if(leftCount==total){
            String temp = "";
            for(int i = rightCount; i < total; i++){
                temp += ")";
            }
            generateParentheses(processed+temp, total, leftCount, rightCount + (total-rightCount), list);
        }
        if(leftCount < total && rightCount < total && leftCount==rightCount){
            generateParentheses(processed+"(",total,leftCount+1,rightCount,list);
        }
        else if(leftCount < total && rightCount < total && leftCount > rightCount){
            generateParentheses(processed+"(",total,leftCount+1, rightCount, list);
            generateParentheses(processed+")",total,leftCount,rightCount+1, list);
        }
        return list;
    }
}