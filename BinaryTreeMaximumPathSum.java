import java.util.Scanner;
public class BinaryTreeMaximumPathSum{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(s);
        tree.display();
        System.out.println(maxPathSum(tree.root));
    }
    public static int maxPathSum(TreeNode root) {
        maxPathSumRecur(root);
        return mainMax;
    }
    static int mainMax = Integer.MIN_VALUE;
    public static int maxPathSumRecur(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = maxPathSumRecur(node.left);
        int right = maxPathSumRecur(node.right);
        if(left < 0){
            left = 0;
        }
        if(right < 0){
            right = 0;
        }
        if(left+right+node.val > mainMax){
            mainMax = left+right+node.val;
        }
        return Math.max(left,right)+node.val;
    }
}