import java.util.Scanner;
public class MinimumDepthOfBinaryTree{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(s);
        tree.display();
        System.out.println(minDepth(tree.root));
    }
    public static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right != null){
            return minDepth(root.right)+1;
        }
        if(root.right == null && root.left != null){
            return minDepth(root.left)+1;
        }
        return Math.min(minDepth(root.left),minDepth(root.right))+1;

    }
}