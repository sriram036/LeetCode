public class MaximumAreaOfLongestDiagonalRectangle{
    public static void main(String[] args){
        int[][] dimensions = {{9,3},{8,6}};
        System.out.println(areaOfMaxDiagonal(dimensions));
    }
    public static int areaOfMaxDiagonal(int[][] dimensions) {
        double sqrt = 0;
        int l = 0;
        int w = 0;
        int maxArea = 0;
        for(int i = 0; i < dimensions.length; i++){
            l = dimensions[i][0];
            w = dimensions[i][1];
            double temp = Math.sqrt((l*l)+(w*w));
            int area = l*w;
            if(temp >= sqrt){
                if(temp == sqrt){
                    if(maxArea < area){
                        maxArea = l*w;
                    }
                }
                else if(temp > sqrt){
                    maxArea = area;
                    sqrt = temp;
                }
            }
        }
        return maxArea;
    }
}