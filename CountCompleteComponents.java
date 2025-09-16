import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class CountCompleteComponents{
    public static void main(String[] args){
        int n = 6;
        int[][] edges = new int[4][2];
        edges[0] = new int[]{0,1};
        edges[1] = new int[]{0,2};
        edges[2] = new int[]{1,2};
        edges[3] = new int[]{3,4};
        System.out.println(countCompleteComponents(n, edges));
        
    }
    public static int countCompleteComponents(int n, int[][] edges) {
        boolean[] isVisited = new boolean[n];
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adjacencyList.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }
        int count = 0;
        for(int i = 0;i < n; i++){
            if(!isVisited[i]){
                boolean isCycleFound = isCycle(edges, i, isVisited, adjacencyList);
                if(isCycleFound){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isCycle(int[][] edges, int node, boolean[] isVisited, List<List<Integer>> adjacencyList){
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        isVisited[node] = true;
        while(!queue.isEmpty()){
            Integer current = queue.poll();
            list.add(current);
            for(Integer num : adjacencyList.get(current)){
                if(!isVisited[num]){
                    queue.add(num);
                    isVisited[num] = true;
                }
            }
        }
        boolean isComplete = true;
        for(int num : list){
            if(adjacencyList.get(num).size() != list.size()-1){
                isComplete = false;
                break;
            }
        }
        if(isComplete){
            return true;
        }
        return false;
    }
}