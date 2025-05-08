public class PowerOfFour{
    public static void main(String[] args){
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }
    public static boolean isPowerOfFour(int n){
        if(n <= 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        return (n%4)==0 && isPowerOfFour(n/4);
    }
}