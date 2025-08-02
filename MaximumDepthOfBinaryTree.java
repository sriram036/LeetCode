import java.util.Scanner;
public class MaximumDepthOfBinaryTree{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(s);
        tree.display();
        System.out.println(maxDepth(tree.root));
    }
    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        return Math.max(left,right)+1;
    }
}