public class DivideTwoIntegers{
    public static void main(String[] args){
        int dividend = -2147483648;
        int divisor = -1;
        System.out.println(divide(dividend, divisor));
    }
    public static int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1){
            return 2147483647;
        }
        return dividend/divisor;
    }
}