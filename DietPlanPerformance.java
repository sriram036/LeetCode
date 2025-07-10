public class DietPlanPerformance {
    public static void main(String[] args) {
        int[] calories = {1, 2, 3, 4, 5};
        int k = 1;
        int lower = 3;
        int upper = 3;
        System.out.println(dietPlanPerformance(calories, k, lower, upper));
    }
    public static int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int windowSpace = 0;
        for(int i = 0; i < k; i++){
            windowSpace += calories[i];
        }
        int counter = 0;
        if(windowSpace < lower){
            counter -= 1;
        }
        else if(windowSpace > upper){
            counter += 1;
        }
        for(int i = k; i < calories.length; i++){
            windowSpace += calories[i] - calories[i-k];
            if(windowSpace < lower){
                counter -= 1;
            }
            else if(windowSpace > upper){
                counter += 1;
            }
        }
        return counter;
    }
}
