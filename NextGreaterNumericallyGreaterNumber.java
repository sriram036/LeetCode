import java.util.HashMap;
public class NextGreaterNumericallyGreaterNumber{
    public static void main(String[] args){
        NextGreaterNumericallyGreaterNumber obj = new NextGreaterNumericallyGreaterNumber();
        System.out.println(obj.nextBeautifulNumber(1000));
    }
    public int nextBeautifulNumber(int n) {
        return sol(n+1);
    }
    public int sol(int n){
        boolean isFound = false;
        while(!isFound){
            int temp = n;
            HashMap<Integer, Integer> map = new HashMap<>();
            while(temp > 0){
                int digit = temp%10;
                map.put(digit, map.getOrDefault(digit, 0)+1);
                temp /= 10;
            }
            int counter = 0;
            for(int digit : map.keySet()){
                int val = map.get(digit);
                if(val == digit){
                    counter++;
                }
            }
            if(map.size()==counter){
                break;
            }
            n++;
        }
        return n;
    }
}