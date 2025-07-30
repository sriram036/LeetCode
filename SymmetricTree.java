import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class SymmetricTree{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(s);
        tree.display();
        System.out.println(isSymmetric(tree.root));
    }
    public static boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right= queue.poll();
            if((left == null && right != null) || (left != null && right == null)){
                return false;
            }
            if(left != null && right != null && left.val != right.val){
                return false;
            }
            if(left != null && right != null){
                queue.add(left.left);
                queue.add(right.right);
                queue.add(left.right);
                queue.add(right.left);
            }
        }
        return true;
    }
}