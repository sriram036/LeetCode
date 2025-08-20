public class ArrangingCoins{
    public static void main(String[] args){
        System.out.println(arrangeCoins(5));
    }
    public static int arrangeCoins(int n) {
        int steps = 0;
        int counter = 0;
        while(n > 0){
            n -= counter++;
            if(n >= counter){
                steps++;
            }
        }
        return steps;
    }
}