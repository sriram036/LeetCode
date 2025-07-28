import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BinaryTreeZigzagLevelOrderTraversal{
    public static void main(String[] args){
        TreeNode tree = new TreeNode();
        Scanner s = new Scanner(System.in);
        tree.populate(s);
        tree.display();
        List<List<Integer>> res = zigzagLevelOrder(tree.root);
        for(List<Integer> list : res){
            System.out.print(list + " ");
        }
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root==null){
            return lists;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        boolean isReverse = false;
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int len = queue.size();
            for(int i = 0; i< len; i++){
                TreeNode current = queue.pop();
                if(isReverse){
                    list.add(0,current.val);
                }
                else{
                    list.add(current.val);
                }
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            lists.add(list);
            isReverse = !isReverse;
        }
        return lists;
    }
}