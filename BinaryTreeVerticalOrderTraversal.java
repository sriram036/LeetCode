import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Collections;
public class BinaryTreeVerticalOrderTraversal{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(s);
        tree.display();
        List<List<Integer>> lists = verticalOrder(tree.root);
        for(List<Integer> list: lists){
            System.out.print(list + " ");
        }
        System.out.println();
    }
    public static List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> lists =new ArrayList<>();
        if(root == null){
            return lists;
        }
        HashMap<Integer, List<Integer>> map= new HashMap<>();
        Queue<Integer> indexes = new LinkedList<>();
        Queue<TreeNode> values = new LinkedList<>();
        indexes.add(0);
        values.add(root);
        while(!values.isEmpty()){
            int index = indexes.poll();
            TreeNode value = values.poll();
            if(!map.containsKey(index)){
                List<Integer> list = new ArrayList<>();
                list.add(value.val);
                map.put(index,list);
            }
            else{
                List<Integer> temp = map.get(index);
                temp.add(value.val);
                map.put(index, temp);
            }
            if(value.left != null){
                indexes.add(index-1);
                values.add(value.left);
            }
            if(value.right != null){
                indexes.add(index+1);
                values.add(value.right);
            }
        }
        List<Integer> keys = new ArrayList<>();
        for(int key : map.keySet()){
            keys.add(key);
        }
        Collections.sort(keys);
        for(int key : keys){
            lists.add(map.get(key));
        }
        return lists;
    }
}