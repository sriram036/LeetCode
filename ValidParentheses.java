import java.util.Stack;
public class ValidParentheses{
    public static void main(String[] args){
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
            else if(c == '}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
            else{
                return false;
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}