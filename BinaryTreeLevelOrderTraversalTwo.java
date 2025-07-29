import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryTreeLevelOrderTraversalTwo{
    public static void main(String[] args){
        TreeNode tree = new TreeNode();
        Scanner s= new Scanner(System.in);
        tree.populate(s);
        tree.display();
        List<List<Integer>> res = levelOrderBottom(tree.root);
        for(List<Integer> list : res){
            System.out.print(list.toString() + " ");
        }
    }
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root == null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < len; i++){
                TreeNode curr = queue.poll();
                temp.add(curr.val);
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            lists.add(0,temp);
        }
        return lists;
    }
}