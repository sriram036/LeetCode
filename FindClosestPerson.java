public class FindClosestPerson{
    public static void main(String[] args){
        int x = 2;
        int y = 7;
        int z = 4;
        System.out.println(findClosest(x,y,z));
    }
    public static int findClosest(int x, int y, int z) {
        int distanceOne = Math.abs(x-z);
        int distanceTwo = Math.abs(y-z);
        if(distanceOne == distanceTwo){
            return 0;
        }
        else if(distanceOne < distanceTwo){
            return 1;
        }
        else {
            return 2;
        }
    }
}
