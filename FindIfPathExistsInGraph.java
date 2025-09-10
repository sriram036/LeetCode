import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class FindIfPathExistsInGraph{
    public static void main(String[] args){
        int n = 3;
        int[][] edges = new int[][]{{0,1},{1,2},{2,0}};
        int source = 0;
        int destination = 2;
        System.out.println(validPath(n, edges, source, destination));
    }
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination){
            return true;
        }
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0;i < edges.length; i++){
            if(map.containsKey(edges[i][0])){
                List<Integer> list = map.get(edges[i][0]);
                list.add(edges[i][1]);
                map.put(edges[i][0], list);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(edges[i][1]);
                map.put(edges[i][0], list);
            }
            
            if(map.containsKey(edges[i][1])){
                List<Integer> list = map.get(edges[i][1]);
                list.add(edges[i][0]);
                map.put(edges[i][1], list);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(edges[i][0]);
                map.put(edges[i][1], list);
            }
        }
        // int size = map.size();
        boolean[] isVisited = new boolean[n];
        // System.out.println(map);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        isVisited[source] = true;
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0; i < len; i++){
                int cur = queue.poll();
                if(cur == destination){
                    return true;
                }
                List<Integer> temp = map.get(cur);
                for(int j = 0; j < temp.size(); j++){
                    int val = temp.get(j);
                    if(!isVisited[val]){
                        isVisited[val] = true;
                        queue.add(val);
                    }
                }
            }
        }
        return false;
    }
}