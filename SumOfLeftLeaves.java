import java.util.Scanner;
public class SumOfLeftLeaves{
    public static void main(String[] args){
        TreeNode tree = new TreeNode();
        Scanner s= new Scanner(System.in);
        tree.populate(s);
        System.out.println(sumOfLeftLeaves(tree.root));
    }
    public static int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        return sumOfLeftLeaves(root,false);
    }
    public static int sumOfLeftLeaves(TreeNode node, boolean isLeft){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return isLeft ? node.val : 0;
        }
        return sumOfLeftLeaves(node.left, true)+sumOfLeftLeaves(node.right, false);
    }
}