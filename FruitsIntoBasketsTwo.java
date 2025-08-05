import java.util.HashMap;
public class FruitsIntoBasketsTwo{
    public static void main(String[] args){
        int[] fruits = {4,2,5};
        int[] baskets = {3,5,4};
        System.out.println(numOfUnplacedFruits(fruits, baskets));
    }
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        for(int i = 0; i < fruits.length; i++){
            for(int j = 0;j < baskets.length; j++){
                if(!map.containsKey(j) && fruits[i]<= baskets[j]){
                    map.put(j, fruits[i]);
                    counter++;
                    break;
                }
            }
        }
        // System.out.println(counter);
        return fruits.length-counter;
    }
}