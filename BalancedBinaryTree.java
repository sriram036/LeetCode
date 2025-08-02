import java.util.Scanner;
public class BalancedBinaryTree{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(s);
        tree.display();
        System.out.println(isBalanced(tree.root));
    }
    public static boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int height = Math.abs(findHeight(root.left)-findHeight(root.right));
        return height<2 && isBalanced(root.left) && isBalanced(root.right);
    }
    public static int findHeight(TreeNode node){
        if(node==null){
            return -1;
        }
        int left = findHeight(node.left);
        int right = findHeight(node.right);
        return Math.max(left,right)+1;
    }
}